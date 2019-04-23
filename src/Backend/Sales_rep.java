package Backend;
import db_pack.Customer_Registry;

public class Sales_rep extends Employee {

    public Sales_rep(String Fname, String Lname, String Employeeid) {
        super(Fname, Lname, Employeeid);
    }

    public void Create_Customer(String Fname, String Lname, int BankAccountNum){
        Customer newc = new Customer(Fname,Lname,BankAccountNum);
        Customer_Registry.getInstance().add_Customer(newc);
    }

}
