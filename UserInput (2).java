import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine()

        // String str = sc.nextLine();
        // System.out.println(str);

        // next()
        String str = sc.next();
        System.out.println("str: " + str);
        String str2 = sc.next();
        System.out.println("str2: " + str2);
        String str3 = sc.nextLine();
        System.out.println("str3: " + str3);
        sc.close();

        // String st1 = new String("Java").intern();
        // String st2 = new String("java").intern();
        // String st3 = new String("Java").intern();
        // String st4 = new String("Coding").intern();
        /**
         * StringBuffer sb = new StringBuffer("helloworls");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("sb reference before:" + System.identityHashCode(sb));

        sb = sb.append("programs2wq1bnfhj");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("sb reference after:" + System.identityHashCode(sb));
         */

    }

}
