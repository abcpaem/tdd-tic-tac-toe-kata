# TDD Tic Tac Toe kata
Test Driven Development exercise for Tic Tac Toe.

### What is a kata?

A Kata in martial arts means “a system of individual training exercises”. Just like in martial arts, coding also requires consistent practise to hone in the skill.

### What is the goal?

Plan out and spend 30-45 minutes having a go at the Tic Tac Toe Kata using Test-Driven Development. It is not expected to have a finished solution but have had a good go at using Test-Driven Development.

### Instructions

- Tic Tac Toe is a popular game played across the world! Read the Tic Tac Toe requirements at Coding Dojo: https://kata-log.rocks/tic-tac-toe-kata
- Solve the Tic Tac Toe kata in Java programming language.

### Test Driven Development process

The TDD approach will start with the simplest case scenario, then it will grow in complexity until the game implementation is completed:

1) Add test to check playing board size. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults01.html).
2) Add test to check player names. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults02.html).
3) Add test to check the first player turn. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults03.html).
4) Add test to check that players take turns. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults04.html).
5) Add test to check that the game board is displayed. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults05.html).
6) Refactor checkPlayingBoardSize test. See test still passing [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults06.html).
7) Refactor checkPlayerNames test. See test still passing [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults07.html).
8) Refactor checkFirstPlayerTurn test to add RandomStub. See test still passing [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults08.html).
9) Add test to check play result when board position is available. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults09.html).
10) Add test to check play result when board position is not available. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults10.html).
11) Add test to check play result when board position is not valid. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults11.html).
12) Add test to check game over with no winner. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-tic-tac-toe-kata/blob/main/docs/TestResults12.html).


### What's next?:
- Continue developing the solution for the Tic Tac Toe game.
- Add edge case tests during development.
- Add console application for user interaction.

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