package lab3;

import java.util.Scanner;

public class Hangman {
    char[] generatedLetters;
    int lives = 5;
    char[] underscores;
    String generatedWord;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Generate the word for Hangman
        String generatedWord = WordGenerator.generateWord();

        // Create the game instance
        Hangman hangman = new Hangman(generatedWord);

        // Start the gameplay
        hangman.gameplay();
    }

    // Constructor to initialize the game
    public Hangman(String generatedWord) {
        this.generatedWord = generatedWord;
        this.generatedLetters = generatedWord.toCharArray();
        this.underscores = new char[generatedLetters.length];

        // Initialize underscores array
        for (int i = 0; i < generatedLetters.length; i++) {
            underscores[i] = '_';
        }
    }

    // Gameplay logic
    public void gameplay() {
        while (lives > 0) {
            System.out.print("\nEnter a letter: ");
            char letter = input.nextLine().charAt(0);

            // Check if the letter exists in the word
            boolean correctGuess = false;
            for (int i = 0; i < generatedLetters.length; i++) {
                if (generatedLetters[i] == letter) {
                    underscores[i] = letter; // Reveal the letter
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                lives--; // Deduct a life if the guess is wrong
            }

            // Print the current state of the word
            printing();

            // Check if the player has won
            if (String.valueOf(underscores).equals(generatedWord)) {
                System.out.println("\nCongratulations! You've guessed the word.");
                return;
            }

            // Print lives remaining
            System.out.println("\nLives remaining: " + lives);

            // Check if the player has lost
            if (lives == 0) {
                System.out.println("You lost! The word was: " + generatedWord);
            }
        }
    }

    // Method to print the underscores
    public void printing() {
        for (char c : underscores) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
