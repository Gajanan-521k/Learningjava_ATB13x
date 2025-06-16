package ex_04_incredecrement;

public class Lab005_chek {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a; // 5(6) + (7)7 >> 12

        System.out.println("a: " + a); // Output: 7

        System.out.println("b: " + b); // Output: 12


    }
}
