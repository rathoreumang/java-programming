import java.util.*;
 
class sumn {
    public static void main(String[] args) {
        int i;
        int sum=0;
        int n; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a no");
        n = sc.nextInt();
        
        
 
        for(i=0;i<=n;i++)
        {
            if(i%2==0){
                
            }
            else{
                System.out.println("Added " + i + "!!");
                sum = sum + i;
            }
        
        }  
        
        System.out.println("Sum of first "+n+" even natural nos = "+sum);
    }
}