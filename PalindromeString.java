import java.util.Scanner;

public class PalindromeString {
    static Scanner scan = new Scanner(System.in);

    public static String inputString(){
        String word;
        System.out.println("Input a word: ");
        word= scan.next();
        return word;
    }

    public static String reverseString(String word){
        String reversedWord = "";
        int len =  word.length();
        for (int i = len-1; i >= 0; i--){
            reversedWord = reversedWord + word.charAt(i);
        }
        return  reversedWord;
    }

    public static void checkPalindromeString(){
        String originalString = inputString();
        String reversedString = reverseString(originalString);
        if(originalString.equals(reversedString)){
            System.out.println("The String is a Palindrome. ");
        }
        else {
            System.out.println("The String is not a Palindrome. ");
        }
    }

    public static void main(String[] args) {
        checkPalindromeString();
    }

}
