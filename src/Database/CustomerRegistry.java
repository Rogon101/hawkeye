package Database;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Backend.Customer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Isamu
 */
public class  CustomerRegistry{

    private ArrayList<Customer> C_array;

    static private final CustomerRegistry instance = new CustomerRegistry();



    private CustomerRegistry(){
        this.C_array = new ArrayList<Customer>();
    }



    public Customer find_Customer(String Name){
        for(Customer d : C_array){
            if(d.getName() != null && d.getName().contains(Name)){
                return d;
            }
        }
        return null;
    }



    public void add_Customer(Customer c){
        C_array = new ArrayList<Customer>();
    }



    public String remove_Customer(String c){
        Customer s = find_Customer(c);
        if ( s == null){
            return "Customer Does Not Exist";
        }
        C_array.remove(s);
        return s.getName()+" Has Been Removed";
    }



    public static CustomerRegistry getInstance(){
        return instance;
    }



    /**
     * @param args the command line arguments
     */

}

