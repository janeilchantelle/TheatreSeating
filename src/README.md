TheatreSeating Project

Overview

The TheatreSeating project models a simple movie theatre seating arrangement.
It provides functionalities to display the seating chart and reserve seats.
The seating chart uses '0' to represent an available seat and 'X' to represent a reserved seat.

Features

Display the current seating chart.
Reserve a seat if it is available.
Notify the user if the seat is already reserved.
Class Description

TheatreSeating
The TheatreSeating class includes the following methods:

Constructor: Initializes the seating chart with all seats available.
displaySeatingChart: Displays the current seating arrangement.
reserveSeat: Reserves a seat if available; notifies the user if the seat is already taken.

How to Run

Set Up the Project in IntelliJ:

Open IntelliJ IDEA.
Click on New Project from the Welcome screen or File -> New -> Project from the top menu if you already have IntelliJ open.
Select Java from the list of project types.
Click Next.
Give your project a name (e.g., TheatreSeatingProject).
Choose a location to save your project.
Click Finish.

Create a New Java Class:

In the Project window on the left side, right-click on the src directory.
Select New -> Java Class.
Name the class TheatreSeating (make sure the file is named TheatreSeating.java).
Click OK or Finish.
Copy the provided code into the TheatreSeating.java file.

Run the Program:

Right-click on the TheatreSeating class file in the Project window.
Select Run 'TheatreSeating.main()'.

Usage

The program starts by initializing a TheatreSeating object with a seating chart of 5 rows and 5 columns.
The initial seating chart is displayed.
The user is prompted to reserve a seat by entering the row and column.
The program checks if the seat is available and reserves it if possible.
The updated seating chart is displayed.
The program repeats the reservation process to demonstrate checking for already reserved seats.
The final seating chart is displayed.
