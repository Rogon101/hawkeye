package Backend;

public class Employee {
    private String Fname;
    private String Lname;
    private String EmployeeId;

    public Employee (String Fname , String Lname , String Employeeid){
        this.Fname = Fname;
        this.Lname = Lname;
        this.EmployeeId = Employeeid;
    }

    public String getLname() {
        return Lname;
    }

    public String getFname() {
        return Fname;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getName(){
        String Name = Fname+" "+Lname;
        return Name;
    }
}
