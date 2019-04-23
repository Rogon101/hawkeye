package GUI;
import Backend.*;

import java.util.Scanner;

public class Main {
    private String username = "username";
    private String password = "password";

    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void login(){
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String u = in.nextLine().replaceAll("\\s+","");
        System.out.print("Password: ");
        String p = in.nextLine();
        if(!(username.equals(u) && password.equals(p))){
            login();
        }
    }

    public void SRmenu(){
        Scanner choice = new Scanner(System.in);
        String Screen = "|---------------------------|\n"+
                        "|   SALES REPRESENTITIVE    |\n"+
                        "|---------------------------|\n"+
                        "Select: \n"+
                        "[A] View Customers\n"+
                        "[B] Find Customer\n"+
                        "[C] Create Customers\n"+
                        "[D] \n"+
                        "[E]\n"+
                        "[Q] Quit to Log in\n";
        System.out.println(Screen);
    }

    public static void main(String[] args){
        Main mm = new Main();

       // mm.login();
        mm.SRmenu();
    }
}
