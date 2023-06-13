import java.util.Scanner;

public class FacotialNumber {

    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input a number: ");
        number = scan.nextInt();
        return number;
    }

    public static void getFactorial(){
        int number = inputNumber();
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is "+ factorial);
    }

    public static void main(String[] args) {
        getFactorial();
    }

}
