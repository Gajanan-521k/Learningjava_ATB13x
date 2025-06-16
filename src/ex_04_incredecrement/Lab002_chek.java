package ex_04_incredecrement;

public class Lab002_chek {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // 4 >> i = 1(2) + (3)3
//                                         out of bracket value to be considered
    }
}
