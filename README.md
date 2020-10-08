# Quotes

- Once you clone the repo...
- run *./gradlew run* in the terminal

## Dependencies

- Check within *build.gradle* if the dependencies seciton looks similar to below:

- This dependency is used by the application

       implementation 'com.google.guava:guava:28.0-jre'

- Use JUnit test framework

       testImplementation 'junit:junit:4.12'

- Used to access gson file

       implementation 'com.google.code.gson:gson:2.8.6'

## Functionality

- Uses the recentquotes.json file to show random popular book quotes.
- Uses GSON to parse the .json file
- returns one quote each time it is run

## This is an application that will get a random quote from the Ron Swanson quotes API saves it to the json file in the assets folder, and prints it to the console.

- If it cannot establish a connection to the API for whatever reason, it reads in and parses the json file and prints out a random quote from there.
     
## Install

- After cloning the repo, cd into it and run ./gradlew build from the terminal to install the dependencies for this project.
     
## Running and Testing

- The app can be run using ./gradlew run in the terminal, it will output a random quote in the console. To run the tests for this app, run ./gradlew test in the terminal to run all the included test suites.
