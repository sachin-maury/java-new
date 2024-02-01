import java.util.*;
public class cbsecalculater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your physics marks:");
            int physics=sc.nextInt();
            System.out.println("Enter your chemistry marks:");
            int chemistry=sc.nextInt();
            System.out.println("Enter your mathematics marks:");
            int mathematics=sc.nextInt();
            System.out.println("Enter your hindi marks:");
            int hindi=sc.nextInt();
            System.out.println("Enter your english marks:");
            int english=sc.nextInt();
            float percentage=((physics + chemistry + mathematics + hindi + english)/500.0f)*100;
            System.out.println("percentage:");
            System.out.println(percentage);
        }

    }
    
    
}
