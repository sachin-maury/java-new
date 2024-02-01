import java.util.*;
public class pact4 {
    public static void main(String[] args) {
        Float n1, n2, n3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your physics marks");
            n1=sc.nextFloat();
            System.out.println("Enter your chemistetry masrks");
            n2=sc.nextFloat();
            System.out.println("Enter ypur math marks");
            n3=sc.nextFloat();
        }
        float average=(n1+n2+n3)/3.0f;
        if( average>=40 && n1>30 && n2>30 && n3>30){
            System.out.println("Congratulation you have been pass:");

        }
        else{
            System.out.println("Sorry you are fail:");
        }

    }
}
