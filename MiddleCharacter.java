import java.util.Scanner;

public class MiddleCharacter {


    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return String.valueOf(str.charAt(middle));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = getMiddleCharacter(input);
        System.out.println("Middle character(s): " + result);
    }
}