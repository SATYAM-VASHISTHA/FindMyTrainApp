

Find My Train App
======================

Overview
-----------

The Find My Train App is a Java-based application designed to help users find trains between two stations. The app allows users to input their departure and destination station names, and it returns a list of trains that operate between those stations.

Features
------------

*   User-friendly interface for inputting departure and destination station names
*   Returns a list of trains that operate between the specified stations
*   Includes train details such as train ID, train name, and train type
*   Utilizes a robust data structure to store train and station information

Requirements
---------------

*   Java 8 or later
*   Java Development Kit (JDK)

Usage
-----

1.  Compile the `FindMyTrainApp.java` file using the `javac` command.
2.  Run the `FindMyTrainApp` class using the `java` command.
3.  Follow the prompts to input your departure and destination station names.
4.  The app will display a list of trains that operate between the specified stations.

Code Structure
-----------------

The code is organized into several classes, each representing a different entity in the train system:

*   `Train.java`: Represents a train with attributes such as train ID, train name, and train type.
*   `Station.java`: Represents a station with attributes such as station ID and station name.
*   `Platform.java`: Represents a platform with attributes such as platform number and associated train.
*   `Schedule.java`: Represents a schedule with attributes such as arrival and departure times, and associated train and station.
*   `TrainSystem.java`: Represents the overall train system, responsible for managing trains, stations, and schedules.
*   `FindMyTrainApp.java`: The main application class that interacts with the user and utilizes the `TrainSystem` class to find trains between stations.

Contributing
------------

Contributions are welcome! If you'd like to contribute to the project, please fork the repository and submit a pull request with your changes.

License
-------

The MIT License (MIT)

Copyright (c) 2025 Satyam Vashistha

Permission is hereby granted to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY.