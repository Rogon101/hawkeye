package Backend;
import Database.CustomerRegistry;

public class SalesRep extends Employee {

    public SalesRep(String Fname, String Lname, String Employeeid) {
        super(Fname, Lname, Employeeid);
    }

    public void Create_Customer(String Fname, String Lname, int BankAccountNum){
        Customer newc = new Customer(Fname,Lname,BankAccountNum);
        CustomerRegistry.getInstance().add_Customer(newc);
    }

}
