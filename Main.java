import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Account Holder Name");
        String accountholername = sc.nextLine();
        System.out.println("Enter The Account Number");
        int accountnumber = sc.nextInt();
        System.out.println("Enter The Amount");
        int balance = sc.nextInt();
        System.out.println("Enter The PIN");
        int pin = sc.nextInt();

        while (balance >= 0) {

            while (true) {
            System.out.println("The ATM Machine: ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance Check");
            System.out.println("4.Amount Transfer");
            System.out.println("5.PIN Change");
            System.out.println("6.Exit");


                System.out.println("Enter Your Option: ");
                int option = sc.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Enter The Amount TO Deposit");
                        int amount = sc.nextInt();
                        if (amount > 0) {
                            balance = balance + amount;
                        }
                        System.out.println("The amount is Deposited");
                        System.out.println("Thank You Visit Again");
                        break;
                    case 2:
                        System.out.println("Enter The Withdraw Amount");
                        int withdraw = sc.nextInt();
                        if (withdraw <= balance) {
                            System.out.println("Take Your Withdraw Amount " + withdraw);
                            balance-=withdraw;
                            System.out.println("Please Take Your Money");
                            System.out.println("Thank You Visit Again");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                    case 3:
                        System.out.println("Tha Available Balance is " + balance);
                        System.out.println("Thank You Visit Again");
                        break;
                    case 4:
                        System.out.println("Enter The Receiver Account Number");
                        int number = sc.nextInt();
                        System.out.println("Enter the  Transfer Amount");
                        int transferamount = sc.nextInt();
                        if (transferamount <= balance) {
                            balance-=transferamount;
                            System.out.println("The Amount is successfully Transfered to " + number);
                            System.out.println("Thank You Visit Again");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                    case 5:
                        System.out.println("Enter The Current PIN ");
                        int current = sc.nextInt();
                        if (pin == current) {
                            System.out.println("Enter The 4 Digit OTP");
                            int otp = sc.nextInt();
                            System.out.println("Enter The New PIN");
                            int New= sc.nextInt();
                            System.out.println("The ATM PIN is Changed");
                            System.out.println("Thank You Visit Again");
                        } else {
                            System.out.println("Enter The Correct PIN");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting ATM Machine");
                        System.out.println("Thank You Visit Again");
                        sc.close();
                        return;
                    default:
                        System.out.println("Enter The Correct Option");

                }
            }
        }
    }
}