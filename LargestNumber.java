import java.util.Scanner;

public class LargestNumber {

    static Scanner scan = new Scanner(System.in);

    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static int getLargestNumber(int firstNumber, int secondNumber){

        return Math.max(firstNumber, secondNumber);
    }

    public static void findLargestNumber(){

        int firstNumber = inputNumber();
        int secondNumber = inputNumber();
        int thirdNumber = inputNumber();

        int firstLargestNumber = getLargestNumber(firstNumber,secondNumber);
        int lastLargestNumber = getLargestNumber(firstLargestNumber,thirdNumber);

        System.out.println("The largest number is: " + lastLargestNumber);
    }

    public static void main(String[] args) {
        findLargestNumber();
    }



}
