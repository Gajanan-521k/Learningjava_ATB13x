package ex_04_incredecrement;

public class Lab006_chek {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x; // 5(6) + (7)7 + 7(8) + (9)9 >>28

        System.out.println("x = " + x + ", y = " + y); // 9 + 28
    }
}
