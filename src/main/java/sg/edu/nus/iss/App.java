package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("welcome to banking");
        int n =3;
       // double initialbalance;
        BankAccount bankAccount[] = new BankAccount[n];

        for(int i=0;i<bankAccount.length;i++){
           String uuid = UUID.randomUUID().toString();
             double max = 10000.00;
             double min = 1000.00;

             Random randNum = new Random();
             double initialBalance = min + randNum.nextDouble(max);
           // bankAccount[i] = new BankAccount(uuid, initialBalance);
           bankAccount[i] = new BankAccount(uuid, initialBalance);
         }

         bankAccount [0].setFullname("Tan");
         bankAccount [1].setFullname("Fred");
          bankAccount [2].setFullname("Mary");

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();    

        bankAccount[0].deposit(2000.00);
        bankAccount[1].deposit(3000.00);
        bankAccount[2].deposit(4000.00);
        System.out.println("Bank Account after deposit");
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();   
       

        bankAccount[0].withdraw(500.00);
        bankAccount[1].withdraw(300.00);
        bankAccount[2].withdraw(400.00); 
         System.out.println("Bank Account after withdrawal");
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();  

    }
}
