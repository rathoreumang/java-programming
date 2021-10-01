import java.util.*;
public class lcm{
    public static void main(String args[]){
        int a;
        int b;
        int lcm;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number 1:");
        a = sc.nextInt();
        System.out.println("Enter a number 2");
        b = sc.nextInt();
       
        lcm = (a > b ) ? a : b;

    while(true) {
      if( lcm % a == 0 && lcm % b == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
        break;
      }
      ++lcm;
    }
  }
}

