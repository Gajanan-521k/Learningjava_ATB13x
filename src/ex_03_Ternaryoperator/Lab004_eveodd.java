package ex_03_Ternaryoperator;

public class Lab004_eveodd {
    public static void main(String[] args) {
        int a = 10;
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
    }
}
