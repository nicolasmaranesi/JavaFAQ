import java.util.Scanner;

public class DigitCounter {
    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void countDigits(){
        int number = inputNumber();
        int originalNumber = number;
        int counter = 0;
        while (number>0){
            number = number/10;
            counter++;
        }
        System.out.println("The number "+ originalNumber + " has "+ counter + " digits.");

    }

    public static void main(String[] args) {
        countDigits();
    }



}
