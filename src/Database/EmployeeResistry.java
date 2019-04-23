package Database;

public class    EmployeeResistry {
    private static EmployeeResistry ourInstance = new EmployeeResistry();

    public static EmployeeResistry getInstance() {
        return ourInstance;
    }

    private EmployeeResistry() {
    }
}
