class DoctorAssistant extends Employee{
  private String department;

  public DoctorAssistant(String designation, String specialization, String department){
    super(designation, specialization);
    this.department = department;
  }
  
  public void displayInfo(){
    super.displayInfo(specialization, designation);
    System.out.println("Employee Department: " +department);
  }

}
