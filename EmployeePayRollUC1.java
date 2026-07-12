import java.util.Scanner;

class EmployeePayroll {

    private int id;
    private String name;
    private double salary;

    public EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }


}
public class EmployeePayRollUC1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        EmployeePayroll employee=new EmployeePayroll(id, name,salary);

        System.out.println(employee);
    }
   
}