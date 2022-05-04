# TDD Tic Tac Toe kata
Test Driven Development exercise for Tic Tac Toe.

### What is a kata?

A Kata in martial arts means “a system of individual training exercises”. Just like in martial arts, coding also requires consistent practise to hone in the skill.

### What is the goal?

Plan out and spend 30-45 minutes having a go at the Tic Tac Toe Kata using Test-Driven Development. It is not expected to have a finished solution but have had a good go at using Test-Driven Development.

### Instructions

- Tic Tac Toe is a popular game played across the world! Read the Tic Tac Toe requirements at Coding Dojo: https://kata-log.rocks/tic-tac-toe-kata
- Solve the Tic Tac Toe kata in Java programming language.

### Solution:
- Actual solution converts is just testing the initial game setup. There is no main method, all code is called through the tests.
- I started writing simple tests to test the basic functionality of the game.
- The code also started from a simple method and attribute to make the initial tests pass.
- Please check the commits to see how was the TDD process.
- Please also feel free to clone the code and run all the tests locally.

Here you have quick overview of all the tests passing:

![Tic Tac Toe Tests](docs/TicTacToeTestsPassing.PNG)

Click [here](src/test/java/clan/techreturners/TicTacToeTests.java) to see the Tic Tac Toe tests.

Click [here](src/main/java/clan/techreturners/TicTacToe.java) to see the Tic Tac Toe code.

### What's next?:
- Continue developing the solution for the Tic Tac Toe game.
- Add edge case tests during development.
- Refactor code to use a data structure for the game board.

---
## How to run the tests
- cd to the project root folder in the command line
- ``mvn test``

## Technology
This project was built using:
- Java 17.0.2
- JUnit 5.8.2
- Maven 3.8.5
- IntelliJ 2021.3.2 (Community Edition).