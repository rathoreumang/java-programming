import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c; 
        int i;

        int n; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        System.out.println("Fobinacci Series:");
        System.out.println(a);
        System.out.println(b);

        for(i=2;i<n;i++){
            c = b + a;
            System.out.println(c);

            // System.out.println("before...");
            // System.out.println("a is: " + a);
            // System.out.println("b is: " + b);

            a = b;
            b = c;
            

            // System.out.println("after...");
            // System.out.println("a is: " + a);
            // System.out.println("b is: " + b);


        }





    }
}