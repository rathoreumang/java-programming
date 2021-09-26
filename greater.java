import java.util.*;
public class greater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c; 

        System.out.println("Enter value of a:");
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();
        System.out.println("Enter value of c:");
        c = sc.nextInt();
        
        if(a > b){
           if (a > c){
            System.out.println(a + " is greater");
           }
           else{
            System.out.println(c + " is greater");
           }        
        }
        else{
            if (b > c){
            System.out.println(b + " is greater");
           }
           else{
            System.out.println(c + " is greater");
           }
        }

        sc.close();
    }
}