package ex_03_Ternaryoperator;

public class Lab005_Nestedternary {
    public static void main(String[] args) {
        int age = 17;
        String category = (age < 18) ? "Minor"
                : (age <= 65) ? "Adult"
                : "Senior Citizen";

        System.out.println("Category: " + category);
    }
}

