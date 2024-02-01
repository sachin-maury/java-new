import java.util.*;
public class vid18_switch {
    public static void main(String[] args) {
          int age;
          System.out.println("Enter your age");
        try (Scanner sc = new Scanner(System.in)) {
            age=sc.nextInt();
        }
        if(age>58){
            System.out.println("You are exprienced:");
        }
        else if(age>48){
            System.out.println("You are semi-exprienced:");
        }
        else if(age>38){
            System.out.println("You are half-exprienced:");
        }
        else{
            System.out.println("You have not exprienced:");
        }
    }
}
