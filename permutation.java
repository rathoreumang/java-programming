import java.util.*;
public class factorial{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number:");
        a = sc.nextInt();
        System.out.println("output:");

        int n=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            n =  n*(a-i);
        
        int r=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            r =  r*(a-i);
        
                    System.out.println("factorial of "+a+" is " + r);

        int r=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            r =  r*(a-i);
    

        int s=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            s =  (n-r);
        
        int t=1;
        int i;
        for(i=0; i<a; i++){
            //System.out.println( a-i );
            t =  r*(a-i);
        
                    System.out.println("factorial of "+a+" is " + r);               
    
    }
}