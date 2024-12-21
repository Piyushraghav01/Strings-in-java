import java.util.Scanner;

class Reverse {

    public static void reverseString(String str) {
        String revString = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // revString = revString + str.charAt(i);
        // }
        for (int i = 0; i < str.length(); i++) {
            revString = str.charAt(i) + revString;

        }
        System.out.println(revString);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        reverseString(str);
        sc.close();
    }

}
