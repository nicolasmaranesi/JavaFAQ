import java.util.Scanner;

public class ReverseString {
    static Scanner scan = new Scanner(System.in);

    public static String inputString(){
        String word;
        System.out.println("Input a word: ");
        word= scan.nextLine();
        return word;
    }

    public static void reverseString(String word){
        String reversedWord = "";
        int len =  word.length();
        for (int i = len-1; i >= 0; i--){
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println("Ther reversed word is: " + reversedWord);
    }

    public static void main(String[] args) {
        String word =  inputString();
        reverseString(word);
    }

}
