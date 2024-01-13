public class KienThucBoSung {
    public static void main(String[] args) {
        char c = '7';
        System.out.println((int)c);
        System.out.println(Character.isDigit(c));
        System.out.println(c);
        System.out.println();


        // String poo;
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("s1 == s2 " + (s1.equals(s2)));
        System.out.println("s2 == s3 " + (s2.equals(s3)));
        System.out.println("s1 == s3 " + (s1.equals(s3)));

        String s11 = "Hello World";
        String s22 = "Hello World";
        String s33 = new String("Hello World");
        s11 = s11.substring(0,5);
        System.out.println(s1);
        System.out.println(s11);

        System.out.println("s1 == s11 " + (s1 == s11));
        System.out.println("s22 == s33 " + (s22 == s33));

    }
}
