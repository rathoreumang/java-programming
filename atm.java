import java.util.*;
public class atm{
    public static void main(String args[]){
        int balance=0;
        int atmpin = 1; 
        int epin = 0;
        int txn=0; 
        int a=1;

        Scanner sc = new Scanner(System.in);




        System.out.println("** Welcome to SBI ATM!!! \nPlease set your 4-digit ATM Pin (XXXX): ");
        atmpin = sc.nextInt(); 

        while(atmpin<=999 || atmpin>9999){
            System.out.println("Please enter a Valid 4-digit Pin: ");
            atmpin = sc.nextInt();
        }

            while(atmpin>999 && atmpin<=9999){
                System.out.println("\n\n\n\n 1. Balance Enquiry \n 2. Withdraw \n 3. Deposit \n 4. View Balance \n to exit press 0 ");
                a = sc.nextInt();

                switch(a){
                    case 1: {
                        System.out.println("Enter 4-digit PIN: ");
                        epin = sc.nextInt();
                        
                        if(epin==atmpin)
                            System.out.println("Your current balance is : Rs. " + balance);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter 4-digit PIN: ");
                        epin = sc.nextInt();
                        
                        if(epin==atmpin){
                            System.out.println("Enter amount:");
                            txn = sc.nextInt();
                            if(balance > txn){
                                balance = balance - txn;
                                System.out.println("Withdraw successful.. Outstanding bal: Rs. " + balance); 
                            }
                            else{
                            System.out.println("Insuficient funds!!!"); 
                            }

                        }
                        
                        break;
                    }
                    case 3:{
                        System.out.println("Enter 4-digit PIN: ");
                        epin = sc.nextInt();
                        
                        if(epin==atmpin){
                            System.out.println("Enter amount:");
                            txn = sc.nextInt();
                            balance = balance + txn;
                            System.out.println("Amount Deposited.. Outstanding bal: Rs. " + balance); 
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("Enter 4-digit PIN: ");
                        epin = sc.nextInt();
                        
                        if(epin==atmpin)
                            System.out.println("Your current balance is Rs. " + balance);
                        break;
                    }
                    default: {
                        System.out.println("You have been logged out successfully");
                        break;
                    }
                }


                    
            }

            
    
    
    }
}