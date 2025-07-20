
public class BankAccount{
   

  String accountHolderName;
  double balance;

public BankAccount(String name,double initialBalance){

accountHolderName = name;
balance = initialBalance;

}
public void deposite(double amount){
if(amount>0){
balance += amount;
System.out.println("Deposited:" +amount);

}

else {

System.out.println("Deposite amount must be positive.");
}

}


public void withdraw(double amount){

if(amount > 0 && amount <=balance) {

balance -= amount;
System.out.println("withdrawn:"+amount);

}
 
else {

System.out.println("Invalid balance for withdrawal.");

}

}

public void displayBalance(){

System.out.println("Account Holder:"+accountHolderName);
System.out.println("Current Balance:"+balance+"rupees");

}


 public static void main(String[] args){
               

         BankAccount myAccount = new BankAccount("Anitha",5000.0);

        myAccount.displayBalance();
        myAccount.deposite(1500.0);
        myAccount.withdraw(2000.0);
        myAccount.withdraw(6000.00);
        myAccount.displayBalance();


}

}