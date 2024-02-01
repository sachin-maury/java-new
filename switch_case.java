import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        try (Scanner sc = new Scanner(System.in)) {
            age=sc.nextInt();
        }
        switch (age){
            case 18:
                 System.out.println("You are going to become Adult:");
                 break;
            case 24:
                System.out.println("You are going to join a job:");  
                break;
            case 60:
                System.out.println("You are going to retired:");    
                break;
            case 130:
                System.out.println("You are going to deth");
                break;
            default:
                System.out.println("Enjoy your life");  
                    
        }
    }
    
}
