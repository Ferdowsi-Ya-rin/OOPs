import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print ("Enter Balance: ");
    double balance= sc.nextDouble();
  
  BankAccount ibnSina= new BankAccount(balance);
  ibnSina.payBill(5000);
  ibnSina.refund(2000);

System.out.println("Final Balance: " +ibnSina.getBalance());
  }
}
