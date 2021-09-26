import java.util.*;
public class arithmatic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float a; 
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        float b;
        System.out.println("Enter value of b:");
        b = sc.nextInt();
        System.out.println("Arithematic mean of a and b is: " + (a+b)/2 );

        sc.close();
    }
}