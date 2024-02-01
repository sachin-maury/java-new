import java.util.*;
public class practicethree {
    public static void main(String[] args) {
        System.out.println("What is your name");
        try (Scanner sc = new Scanner(System.in)) {
            String name=sc.next();
            System.out.println("Hello " + name + " have a good day!");
        }
    }
    
}
