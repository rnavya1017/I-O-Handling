import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class EmployeeUC4 {
    public static void main(String[] args) {
        EmployeeUC4 e=new EmployeeUC4();
       
    }
     

    public void write(List<EmployeePayroll> employees)
            throws IOException {
                Path path = Paths.get("payroll.txt");

        Files.write(path,
                employees.stream()
                        .map(EmployeePayroll::toString)
                        .toList());

        System.out.println(Files.lines(path).count());
    }

  
}