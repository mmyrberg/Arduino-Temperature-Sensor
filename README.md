# Arduino Temperature Sensor

## Overview

Arduino Temperature Sensor is a full-stack IoT integrated solution that enables the collection and monitoring of temperature data using an Arduino Uno board and various technologies. This project demonstrates the end-to-end flow of data from a physical sensor to a web-based dashboard. It utilizes an Arduino Uno board to read temperature data from a sensor, which is then sent to a Spring Boot backend service for logging in a MySQL database hosted on Planetscale's cloud infrastructure. The temperature data is visualized through a web-based dashboard built using Thymeleaf.

## Features

- Real-time temperature data acquisition from a physical sensor.
- Data transmission from Arduino Uno to Spring Boot backend.
- Secure storage of temperature values in a MySQL database hosted on Planetscale's cloud infrastructure.
- Web-based dashboard for monitoring temperature trends.

## Technology Stack

- **Arduino Uno**: Used for collecting temperature data from the sensor.
- **Spring Boot**: Provides the backend REST API for receiving and processing data.
- **Hibernate**: Manages the interaction with the MySQL database.
- **MySQL**: Stores temperature data securely in the cloud using Planetscale.
- **Thymeleaf**: Powers the web-based dashboard for visualizing temperature trends.

## Getting Started

Follow these steps to set up the Arduino Temperature Sensor project:

### Configure Arduino

Set up your Arduino Uno board to interface with the temperature sensor (hardware setup example in "Arduino-TempSensor-Hardware-Setup.png"). Modify the Arduino code in the repository to suit your sensor and connection.

### Configure Spring Boot Backend

1. Open the Spring Boot project in your preferred IDE.
2. Configure the MySQL database connection in `application.properties`.
3. Run the Spring Boot application to start the backend server.

### Database Setup

Ensure that your MySQL database is accessible from the Spring Boot application. The necessary tables should be created automatically.

### Web Dashboard

1. Open the `dashboard` directory and configure the Thymeleaf templates to display temperature data as per your requirements.
2. Host the dashboard using a web server of your choice.

### Connect Arduino

Deploy the Arduino code to your Arduino Uno board and connect it to the data transmission endpoint of your Spring Boot application.

### Start Monitoring

Access the web-based dashboard to monitor real-time temperature trends.

## Contributing

We welcome contributions to improve this project. To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and ensure that the codebase remains clean.
4. Test thoroughly.
5. Submit a pull request to the main repository.

## License

This project is licensed under the Nackademin License.

## Contact

For any questions or inquiries about this project, please contact:

- Martin Myrberg
- Marcus Nilsson
- Josefina Stenman
- Linda Kjellberg
- Fredrik Jonsson

## Acknowledgments

We would like to express our gratitude to the open-source community for their valuable contributions and support.

---

Feel free to customize this README to match your project's specific details and requirements. Make sure to update the contact information, licensing, and acknowledgments sections accordingly.
