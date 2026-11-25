# 🎮 Advanced Number Guessing Game

## Project Description
The **Advanced Number Guessing Game** is a Java console application. The computer generates a random secret number, and the player tries to guess it within a limited number of attempts.

The player can select one of three difficulty levels. The game gives **Too High** and **Too Low** hints, checks user input, and offers the option to play again.

## Objectives
- Practice Java programming fundamentals.
- Generate random numbers.
- Use loops and conditional statements.
- Validate user input.
- Organize logic using a helper method.

## Features
- Easy, Medium, and Hard difficulty levels.
- Random number generation.
- Limited attempts for each level.
- High/low hints after each guess.
- Input validation for non-integer and out-of-range values.
- Win and Game Over messages.
- Play-again option.

## Difficulty Levels

| Level | Number range | Maximum attempts |
|---|---:|---:|
| Easy | 1–50 | 15 |
| Medium | 1–100 | 10 |
| Hard | 1–200 | 7 |

## Technologies and Java Concepts
- Java
- `Scanner` for reading console input
- `Random` for generating the secret number
- `while` loops for repeated gameplay and validation
- `switch` for difficulty selection
- `if-else` for comparing guesses
- Boolean variables for game state
- A helper method (`getValidInt`) for input validation

## Requirements
- JDK 8 or newer
- Command Prompt / Terminal, or a Java IDE

## Project Structure

```text
Advanced-Number-Guessing-Game/
├── AdvancedNumberGuessingGame.java
└── README.md
```

## How to Compile and Run

1. Open a terminal in the project directory.
2. Compile the source:

   ```bash
   javac AdvancedNumberGuessingGame.java
   ```

3. Run the program:

   ```bash
   java AdvancedNumberGuessingGame
   ```

## How to Play
1. Run the program.
2. Select a difficulty by entering `1`, `2`, or `3`.
3. Enter an integer within the displayed range.
4. Read the hint:
   - **Too High** means the guess is greater than the secret number.
   - **Too Low** means the guess is smaller than the secret number.
   - **Correct** means the secret number has been guessed.
5. Continue until you win or use all attempts.
6. Enter `yes` or `y` to play another round; any other response exits.

## Program Logic

1. Create a `Scanner` to read input and a `Random` object to generate numbers.
2. Display the difficulty menu.
3. Validate the selected difficulty.
4. Use a `switch` statement to set the number range and attempt limit.
5. Generate a secret number using `random.nextInt(upperBound) + 1`.
6. Repeat guesses while attempts remain.
7. Compare each guess with the secret number and display a hint.
8. Display the win or game-over result.
9. Ask whether the player wants another round.

## Input Validation
The `getValidInt(scanner, min, max)` helper method:
- Accepts only integer input.
- Rejects values outside the permitted range.
- Discards invalid non-integer tokens and asks again.

## Sample Console Session

```text
=========================================
   WELCOME TO THE ULTIMATE NUMBER GAME
=========================================

Select Difficulty Level:
1. Easy (1 - 50, 15 attempts)
2. Medium (1 - 100, 10 attempts)
3. Hard (1 - 200, 7 attempts)
Enter choice (1-3): 1

I have selected a number between 1 and 50.
You have 15 attempts to guess it.

Enter your guess: 20
Too Low! Attempts left: 14

Enter your guess: 35
Too High! Attempts left: 13

Enter your guess: 28
Correct! You guessed the number in 3 attempts.

Would you like to play again? (yes/no): no

Thanks for playing! Goodbye!
```

*The sample guesses and result are illustrative; the actual secret number is random.*

## Possible Future Enhancements
- Add a score system based on remaining attempts.
- Save player names and high scores.
- Add a leaderboard.
- Add a graphical user interface.
- Add a timer and game history.

## Author
- **Project:** Advanced Number Guessing Game
- **Language:** Java
- **Type:** Console-based mini project

## License
For educational and learning purposes.
