import java.util.Scanner;

public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String getCustomerId;

    BankAccount(String cname,String cid){
        customerName = cname;
        getCustomerId = cid;
    }

    void deposite(int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: "+previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction occured");
        }
    }

    void showMenu(){

        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is "+ getCustomerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("===============================================================");
            System.out.print("Enter an Option : ");
            option = sc.next().charAt(0);
            System.out.println("===============================================================");
            System.out.println("\n");

            switch (option){

                case 'A':
                    System.out.println("--------------------------------");
                    System.out.println("Balance = "+ balance);
                    System.out.println("--------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount of deposite : ");
                    System.out.println("--------------------------------");
                    int amount = sc.nextInt();
                    deposite(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount to withdraw : ");
                    System.out.println("--------------------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("-------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*******************************************************");
                    break;

                default:
                    System.out.println("Invalid Option!!. Please enter again");
                    break;
            }

        } while (option != 'E');
        System.out.println("ThankYou for using our services");
    }
}
