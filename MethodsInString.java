class MethodsInString {
    public static void main(String[] args) {
        String str = "coding is good.";

        /** Methods in String */

        // length()
        System.out.println(str.length());
        
        // charAt()
        // toLowerCase(), toUpperCase()

        // trim()
        System.out.println(str.trim());

        // substring()
        System.out.println(str.substring(5));
        System.out.println(str.substring(7, 9));

        // replace()
        System.out.println(str.replace('o', '@'));

    }

}
