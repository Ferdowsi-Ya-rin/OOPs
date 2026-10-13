public class BankAccount {

  private double balance;
  public BankAccount(double balance){
    this.balance = balance;
  }

  public double getBalance (){
    return balance;
  }

  public void payBill(double amount){
    balance += amount;
  }

  public void refund(double amount){
    balance += amount;
  }

}
