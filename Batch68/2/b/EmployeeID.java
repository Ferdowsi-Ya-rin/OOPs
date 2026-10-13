public class Employee{
  private String employeeID;
  private String name;

  public Employee(String employeeID, String name){
    this.employeeID= employeeID;
    this.name= name;
  }

  public void displayInfo(){
    System.out.println("Employee ID: " +employeeID);
    System.out.println("Employee Name: " +name);
  }
}
