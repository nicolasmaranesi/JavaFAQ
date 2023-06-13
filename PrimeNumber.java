import java.util.Scanner;

public class PrimeNumber {


    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void checkIfNumberIsPrime(){

        int number = inputNumber();
        int counter = 0;
        if (number>1){
            for (int i = 1 ; i< number; i++){
                if (number%i == 0){
                    counter++;
                }
            }
            if (counter == 2){
                System.out.println("The number " + number + " is a prime number.");
            }
            else {
                System.out.println("The number " + number + "is not a prime number.");
            }
        }

    }
}
