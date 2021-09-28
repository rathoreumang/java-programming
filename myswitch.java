import java.util.*;
public class myswitch{
    public static void main(String args[]){
        int a=1; 

        while(a!=0){

            System.out.println("Enter a [Press 0 to exit]: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            switch(a){
                case 1: {
                    System.out.println("Option 1");
                    break;
                }
                case 2:{
                    System.out.println("Option 2");
                    break;
                }
                case 3:{
                    System.out.println("Option 3");
                    break;
                }
                case 4:{
                    System.out.println("Option 4");
                    break;
                }
                default: {
                    System.out.println("Default Zone!!!");
                    break;
                }
            }
        }
    }
}