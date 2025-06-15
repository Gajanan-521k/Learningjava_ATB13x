package ex_03_Ternaryoperator;

public class Lab006_Maxnum {
    public static void main(String[] args) {
        int a = 11;
        int b = 23;
        int c = -34;

        int bignumber = a > b ? (a > c) ? a : c : (b > c) ? b : c ;

        System.out.println("The biggest number is: " + bignumber);
    }
}
