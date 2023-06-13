import java.util.Scanner;

public class EvenAndOddDigitsCounter {

    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void countEvenAndOddDigits(){
        int number = inputNumber();
        int originalNumber = number;
        int oddDigitCounter = 0;
        int evenDigitCounter = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number = number / 10;
            if (lastDigit % 2 == 0) {
                evenDigitCounter++;
            }
            else {
                oddDigitCounter++;
            }
        }
        System.out.println("The number " + originalNumber+ " has " + evenDigitCounter + " even digits and "+ oddDigitCounter + " odd digits. ");

    }

    public static void main(String[] args) {
        countEvenAndOddDigits();
    }


}
