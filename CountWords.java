import java.util.Scanner;

class CountWords {

    public static void countWords(String str) {
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == ' ') {
        //         count++;
        //     }
        // }
        // count++;

        String s[] = str.split(" ");

        System.out.println("Total words in the sentence: "+ s.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();

        countWords(str);

        sc.close();

    }

}
