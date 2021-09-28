import java.util.*;
public class area{
    public static void main(String args[]){
        int length, breadth;
        int side;
        double radius;
        double base, height;
        int choice = 1;
        double area;
        Scanner sc = new Scanner(System.in); 
        
        while(choice!=0){
            System.out.println("1. Recangle \n 2. Square \n 3. Circle \n 4. Triangle \n To exit press 0 \n Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Enter Length:");
                    length = sc.nextInt();
                    System.out.println("Enter Breadth:");
                    breadth = sc.nextInt();
                    area = length * breadth;
                    System.out.println("area of rectangle is: " + area);

                    break;
                }
                case 2: {
                    System.out.println("Enter Side:");
                    side = sc.nextInt();
                    area = side * side;
                    System.out.println("area of Square is: " + area);


                    break;

                }
                case 3: {
                    System.out.println("Enter Radius:");
                    radius = sc.nextDouble();
                    area = 3.14 * radius * radius;
                    System.out.println("area of Circle is: " + area);


                    break;
                }
                case 4: {
                    System.out.println("Enter Base:");
                    base = sc.nextDouble();
                    System.out.println("Enter Height:");
                    height = sc.nextInt();
                    area = 0.5 * base * height;
                    System.out.println("area of Triangle is: " + area);
                    
                    break;          
                }
                default: {
                    System.out.println("Invalid Entry");
                    break;
                }
            }

        }
    }

}