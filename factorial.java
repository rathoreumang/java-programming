import java.util.*;
public class factorial{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number:");
        a = sc.nextInt();
        System.out.println("output:");

        int f=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            f =  f*(a-i);
        }
                    System.out.println("factorial of "+a+" is " + f);

        
    }
}
        