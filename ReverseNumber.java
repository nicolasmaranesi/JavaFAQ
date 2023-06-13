import java.util.Scanner;

public class ReverseNumber {
    static Scanner scan = new Scanner(System.in);

    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void reverseNumber(int number){
        int reveredNumber = 0;
        while(number!=0){
            reveredNumber = reveredNumber * 10 + number % 10;
            number = number/10;
        }
        System.out.println("Reverse number is: " + reveredNumber);
    }

    public static void main(String[] args) {
        int number = inputNumber();
        reverseNumber(number);
    }

}
