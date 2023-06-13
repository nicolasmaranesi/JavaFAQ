import java.util.Scanner;

public class SwappingNumbers {

    static Scanner scan = new Scanner(System.in);

    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void swapNumbers(int firstNumber, int secondNumber){
        System.out.println("Before the swapping the value of the first number is: " + firstNumber);
        System.out.println("Before the swapping the value of the second number is: " + secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After the swapping the value of the first number is: " + firstNumber);
        System.out.println("After the swapping the value of the second number is: " + secondNumber);

    }

    public static void main(String[] args) {
        int firstNumber = inputNumber();
        int secondNumber = inputNumber();
        swapNumbers(firstNumber,secondNumber);
    }



}
