import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        num1 = getAnswer_int("first",keyboard);
        num2 = getAnswer_int("second",keyboard);
        num3 = getAnswer_int("third",keyboard);

        dub1 = getAnswer_double("first",keyboard);
        dub2 = getAnswer_double("second",keyboard);
        dub3 = getAnswer_double("third",keyboard);

        printSum(num1,num2,num3);

        printSum(dub1,dub2,dub3);

    }

    public static int getAnswer_int(String questionNumber,Scanner keyboard){
        System.out.println("Please enter the " + questionNumber + " whole number you would like to add.");
        return keyboard.nextInt();
    }

    public static double getAnswer_double(String questionNumber,Scanner keyboard){
        System.out.println("Please enter the " + questionNumber + " decimal number you would like to add.");
        return keyboard.nextDouble();
    }

    public static void printSum(double number1, double number2, double number3){
        double sum = number1 + number2 + number3;
        System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " = " + sum);
    }
    public static void printSum(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " = " + sum);
    }
}
