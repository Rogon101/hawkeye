package db_pack;

public class    Employee_Resistry {
    private static Employee_Resistry ourInstance = new Employee_Resistry();

    public static Employee_Resistry getInstance() {
        return ourInstance;
    }

    private Employee_Resistry() {
    }
}
