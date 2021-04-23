This repository contains a spring boot application running on rest to expose the service that list atmlocations.
Main file for the application is LocateAtmApplication.java 


rest endpoints to use this service:
1. https://localhost:8888/atmlist
This service will list all the atm centers and it's details in JSON format

2. http://localhost:8888/atmlist/{city}
This service will list all the atm centers in that specified city and is JSON format

This application has Unit test featured. All associated service,dao and controllers has respected test case written with Mockito Framework on JUNIT-5
