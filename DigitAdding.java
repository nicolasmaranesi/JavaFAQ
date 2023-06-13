import java.util.Scanner;

public class DigitAdding {

    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void addDigits(){
        int number = inputNumber();
        int originalNumber = number;
        int digitSum = 0;

        while (number>0){
            digitSum = digitSum + number % 10 ;
            number = number / 10;
        }

        System.out.println("The sum of the digits of the number "+ originalNumber + " is " + digitSum);
    }

    public static void main(String[] args) {
        addDigits();
    }
}
