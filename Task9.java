package HW8;

public class Task9 {

    public static void main(String[] args) {

        //How would you swap  2 strings without a temporary variable?


        String a = "Java";
        String b = "Hard";

        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After : " + a + " " + b);










    }
}
