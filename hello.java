import java.util.*;

public class hello {
  public static void main(String[] args) {
      System.out.print("Enter number : ");
        try (Scanner sc = new Scanner(System.in)) {
          int button=sc.nextInt();
          switch(button)
          {
              case 1:System.out.println("hello");
              case 2:System.out.println("namasate");
              break;
              case 3:System.out.println("bonjour");
              break;
              default:System.out.println("invaild button");
          }
        }
    }
}