import java.util.*;
public class multiplication{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number:");
        a = sc.nextInt();
        int i;
        int s=1;
        System.out.println("Multiplication of "+a+ ":");
        for(i=1; i<=10; i++){
            s =  a * i;
            System.out.println(a + " x " + i + " = " + s);
        }
    }
}