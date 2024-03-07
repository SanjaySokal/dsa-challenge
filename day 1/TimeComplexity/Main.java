package TimeComplexity;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Ended");
    }
}