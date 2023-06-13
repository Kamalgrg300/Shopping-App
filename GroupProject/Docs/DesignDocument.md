
Design Document

Author: Benjamin Ng and Jesrhythm Kaur

1 Design Considerations

1.1 Assumptions

The application is intended for managing inventory in a chain of floor supply stores.
Users of the system include store employees and customers.
The application's primary goal is to provide an easy way to view and manage the inventory of various flooring products.
It is assumed that the devices running the application have at least 1 GB of RAM and 500 MB of free storage space to ensure enough capacity to run the application smoothly. This will also take into account the possibility of temporary files and caching.



1.2 Constraints

The application should be responsive and provide an intuitive user interface to navigate through.
The application should support various categories of floors, such as tile, stone, wood, laminate and vinyl.



1.3 System Environment

The application is expected to run on android devices running on API 21 level minimum (Lollipop)
The application will be interacting with a local database for storing and retrieving inventory data.

2 Architectural Design

2.1 Component Diagram






The main components of the floor store application are:

User interface: Handles the user interactions and displays inventory data.
Inventory Management: Manages adding, editing, and removing floor products.
Search and Filtering: Enables the users to search for and filter floor products based on various criteria.
Database Interaction: Handles communication between the application and the database storing floor inventory data.


2.2 Deployment Diagram

The application will be deployed on the devices used by store employees and customers. Will be running on android API level 21 minimum.

The application will be using a local database to store inventory data on each users’ device. The drawback to this approach is it will require each user to come to a consensus on the latest iteration to be used for synchronization.



3 Low-Level Design

3.1 Class Diagram
This is the Link to Uml Class diagram:
https://drive.google.com/file/d/1uOqxuhMnOfNTty0z5-k0Vd7IPkgwlaz4/view?usp=sharing


3.2 Other Diagrams

This is the link to other diagrams:
https://drive.google.com/file/d/1xGuZBNJiAcRyFzknTDtkFwvwXOL0VWj7/view?usp=sharing

4 User Interface Design
This is the link to the app design: 
https://drive.google.com/file/d/1-UTcYFVxUJLb1M-oNSmGPn_60XgO3SHU/view?usp=sharing



