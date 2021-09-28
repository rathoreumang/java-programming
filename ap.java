import java.util.*;
public class ap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a:");
        a = sc.nextInt();
        int d;
        System.out.println("Enter d:");
        d = sc.nextInt();

        int i;
        for(i=0; i<5; i++){

            System.out.println("The Ap is :" + (a+(i*d)));
        }
    }
}
