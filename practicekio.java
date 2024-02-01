import java.util.*;
public class practicekio {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.hasNextInt());
        }
    }
    
}
