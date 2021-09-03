import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fname = "";
        String lname = "";
        String favoriteAnimal = "";
        String favoriteFood = "";
        String favoriteSong = "";

        //TODO prompt the user to get input for all of the String variables.
        fname = getAnswer("What is your first name?",keyboard);
        lname = getAnswer("What is your last name?",keyboard);
        favoriteAnimal = getAnswer("What is your favorite animal?",keyboard);
        favoriteFood = getAnswer("What is your favorite food?",keyboard);
        favoriteSong = getAnswer("What is your favorite song?",keyboard);

        //TODO print the output formatted to look like the expected output using String concatenation.
        printAnswer("My name is",fname + " " + lname);
        printAnswer("My favorite animal is the",favoriteAnimal);
        printAnswer("My favorite food is",favoriteFood);
        printAnswer("My favorite song is",favoriteSong);

        keyboard.close();
    }

    public static void printAnswer(String sentence, String answer){
        System.out.println(sentence + " " + answer + ".");
    }

    public static String getAnswer(String question,Scanner keyboard){
        System.out.println(question);
        return keyboard.nextLine();
    }
}
