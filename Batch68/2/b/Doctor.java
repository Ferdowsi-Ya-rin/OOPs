class Doctor extends Employee{
  private String specialization;
  private String designation;

  public Doctor(String employeeID, String name, String specialization){
    super(employeeID, name);
    this.specialization = specialization;
    this.designation;
  }

  public void displayInfo(){
    super.displayInfo(employeeID, name);
    System.out.println("Employee specialization: " +specialization);
    System.out.println("Employee designation: " +designation);
  }
}
