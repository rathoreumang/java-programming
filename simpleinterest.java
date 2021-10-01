import java.util.*;
public class simpleinterest{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter P: ");
        a = sc.nextInt();
        int b;
        System.out.println("Enter R: ");
        b = sc.nextInt();
        int c;
        System.out.println("Enter T: ");
        c = sc.nextInt();
        int s=0;
        s = ((a*b*c)/100);
        System.out.println(s);
    }
}
        