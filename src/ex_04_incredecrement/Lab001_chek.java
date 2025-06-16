package ex_04_incredecrement;

public class Lab001_chek {
    public static void main(String[] args) {
        int a = 5;
        int b = a ++;//        This line does two things because of the post-increment operator a++:
//It assigns the current value of a (which is 5) to b.
//
//Then it increments the value of a by 1 (so a becomes 6 after the assignment).
        System.out.println("a: " + a + ", b: " + b);
    }
}
