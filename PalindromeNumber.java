import java.util.Scanner;

public class PalindromeNumber {
    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }
    public static int reverseNumber(int number){
        int reveredNumber = 0;
        while(number!=0){
            reveredNumber = reveredNumber * 10 + number % 10;
            number = number/10;
        }
        return reveredNumber;
    }

    public static void checkPalindromeNumber(){
        int number = inputNumber();
        int reveredNumber = reverseNumber(number);

        if(number == reveredNumber){

            System.out.println("The number ir a Palindrome.");
        }
        else {
            System.out.println("The number is not a Palindrome. ");
        }
    }

    public static void main(String[] args) {
        checkPalindromeNumber();
    }

}
