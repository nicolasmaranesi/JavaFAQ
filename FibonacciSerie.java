import java.util.Scanner;

public class FibonacciSerie {

    static Scanner scan = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        System.out.println("Input the length of fibonacci series: ");
        number = scan.nextInt();
        return number;
    }

    public static void getFibonacciSeries(){
        int fibonacciLength = inputNumber();
        int number1 = 0;
        int number2 = 1;
        int sum = 0;
        System.out.print(number1+" " + number2);
        for (int i=2; i < fibonacciLength; i++ ){
            sum = number1 + number2;
            System.out.print(" " + sum);
            number1 = number2;
            number2 = sum;
        }
    }

    public static void main(String[] args) {
        getFibonacciSeries();
    }
}
