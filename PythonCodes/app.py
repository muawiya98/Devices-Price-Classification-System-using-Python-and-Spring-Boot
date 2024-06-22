from flask import Flask, request, jsonify
import pickle
import numpy as np
import os

app = Flask(__name__)

# Load the trained model
# root_path = "E:\\Tasks\\MaidsCC\\Devices Price Classification System using Python and Spring Boot"
root_path = "\\".join(os.path.abspath(".").split('\\')[:-1])
results_path = os.path.join(root_path, "Results")

def load_object(filename, path):
    filename = os.path.join(path, filename)
    with open(filename + ".pkl", 'rb') as outp:
        loaded_object = pickle.load(outp)
    outp.close()
    return loaded_object

def pro_mis(x, alt):
    print("value : ", x, ", alt : ", alt)
    if x is np.nan or x is None or x is np.Infinity:
        return alt
    return x

@app.route('/predict', methods=['POST'])
def predict():
    data = request.json
    features = np.array([data['battery_power'], data['blue'], data['clock_speed'], data['dual_sim'], data['fc'],
                         data['four_g'], data['int_memory'], data['m_dep'], data['mobile_wt'], data['n_cores'],
                         data['pc'], data['px_height'], data['px_width'], data['ram'], data['sc_h'], data['sc_w'],
                         data['talk_time'], data['three_g'], data['touch_screen'], data['wifi']])
    median_vector = load_object('median_vector', results_path)
    for ind, value in enumerate(features):
        alt = median_vector[ind]
        features[ind] = pro_mis(value, alt)
    
    svm = load_object('svm', results_path)
    prediction = svm.predict([features])[0]    
    prediction = int(prediction)    
    return jsonify({'prediction': prediction})

if __name__ == '__main__':
    app.run(debug=True)
