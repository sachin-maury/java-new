import java.util.*;

public class cal {
    public static void main(String[] args) {
        System.out.println("enter first number");

        try (Scanner sc = new Scanner(System.in)) {
            int first = sc.nextInt();

            System.out.println("enter second number");
            int second = sc.nextInt();

            // System.out.println(first + second);
             System.out.println("choice operater 1 ,2, 3, 4 (+,-,*,/)");


            int choois = sc.nextInt();
            switch (choois) {
                case 1:
                    System.out.println(first + second);
                    break;
                case 2:
                   System.out.println(first - second);
                    break;
                case 3:
                  System.out.println(first * second);
                    break;
                case 4:
                   System.out.println(first / second);
                    break;
                default:
                    System.out.println("invalid button");
            }
        }

    }
}