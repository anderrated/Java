package lab3new;
import java.util.Scanner;

public class Hangman {
    char[] generatedLetters;
    char[] underscores;
    int lives = 5;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        // generate the word for Hangman
        String generatedWord = WordGenerator.generateWord();
        // convert word to array
        char[] generatedLetters = generatedWord.toCharArray();
        char[] underscores = new char[generatedLetters.length];
        // print underscores
        for (int i = 0; i < generatedLetters.length; i++) {
            underscores[i] = '_';
            System.out.print('_');
        }
        System.out.println();
        // create the game instance
        Hangman hangman = new Hangman(generatedLetters, underscores);
        hangman.gameplay();
    }
    public Hangman(char[] generatedLetters, char[] underscores){
        this.generatedLetters = generatedLetters;
        this.underscores = underscores;
        // create array of underscores
    }
    public void gameplay(){
        while (lives > 0 && !wordGuessed()) {
            System.out.print("Enter a letter: ");
            char letter = input.nextLine().charAt(0);
            boolean correctGuess = false;

            if (letterRevealed(letter, underscores)){
                System.out.println("You already guessed that letter!");
                lives--;
            }
            for (int i = 0; i < generatedLetters.length; i++) {
                if (generatedLetters[i] == letter) {
                    underscores[i] = letter;
                    correctGuess = true;
                }
            } 
            if (!correctGuess){
                lives--;
            }   
            printing();
            System.out.println();
            System.out.println("Lives left: " + lives);
        }
        if (wordGuessed()) {
            System.out.println("You guessed the word!");
        }
        else {
            System.out.println("You ran out of lives!");
        }
        System.out.println("The word was: " + String.valueOf(generatedLetters));
    }

    public void printing(){
        for(int i = 0; i < underscores.length; i++){
            System.out.print(underscores[i] + " ");
        }
    }

    public boolean wordGuessed(){
        for(int i = 0; i < underscores.length; i++){
            if(underscores[i] == '_'){
                return false;
            }
        }
        return true;
    }

    public boolean letterRevealed(char letter, char[] underscores){
        for(int i = 0; i < underscores.length; i++){
            if(underscores[i] == letter){
                return true;
            }
        }
        return false;
    }
}