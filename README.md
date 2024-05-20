# Devices Price Classification System Documentation
## Running the Application:
•	Python Project:
1.	Run the Jupyter Notebook Devices_Price_Classification_System.ipynb to train the machine learning model and serialize it.
2.	Execute app.py to start the Flask application serving the RESTful API.
## Interacting with API Endpoints:
## RESTful Endpoints:

1.	/predict:

Method: POST
Description: Predicts the price range of a device based on its specifications.
Request Body: JSON object containing device specifications.
Response: JSON object with predicted price range.

2.	/api/devices/:
Method: POST
Description: Retrieves a list of all devices.
Response: JSON object containing a list of device details.

3.	/api/devices/{id}:
Method: GET
Description: Retrieves details of a specific device by its ID.
Response: JSON object containing device details.

4.	/api/devices:
Method: POST
Description: Adds a new device.
Request Body: JSON object containing device specifications.
Response: JSON object confirming the addition of the device	 
