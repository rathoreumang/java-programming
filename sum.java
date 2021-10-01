import java.util.*;
public class sum{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        n = sc.nextInt();
        
        int j=1;
        int i;
        for(i=0; i<n; i++){
            j = (n*(n+1))/2;
            System.out.println("j is: " + j);
        }
        
        System.out.println("sum of "+n+" is " +j);
        
    }
}