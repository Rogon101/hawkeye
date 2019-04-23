package Backend;

import java.util.ArrayList;

public class Customer {
    private String Lname;
    private String Fname;
    private int BankAccountNum;
    private ArrayList<Vehicle> V_array;


    public Customer(String Fname, String Lname, int BankAccountNum){
        this.Lname = Lname;
        this.Fname = Fname;
        this.BankAccountNum = BankAccountNum;
        V_array = new ArrayList<Vehicle>();
    }


    public String getFname() {
        return Fname;
    }


    public String getLname() {
        return Lname;
    }


    public int getBankAccountNum() {
        return BankAccountNum;
    }


    public void setFname(String fname) {
        Fname = fname;
    }


    public void setLname(String lname) {
        Lname = lname;
    }


    public void setBankAccountNum(int bankAccountNum) {
        BankAccountNum = bankAccountNum;
    }


    public String getName(){
        String Name = Fname+Lname;
        return Name;
    }


    public void addVehicle(Vehicle v){
        this.V_array.add(v);
    }


    public Vehicle findVehicle(String plateNum){
        for (Vehicle b : V_array){
            if(b.getLicenseplate() != null && b.getLicenseplate() == plateNum) {
                return b;
            }
        }
        return null;
    }


    public String removeVehicle(String plateNum){
        Vehicle v = findVehicle(plateNum);
        if (v == null){
            return "Vehicle Not Found";
        }
        V_array.remove(v);
        return "Vehicle Was Removed";
    }


}
