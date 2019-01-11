package structural.adapter.example2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("4432","Jackie","Chan","trololololo@google.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("7120","Tuna","The Fish","makarena0nthepacific@yahoo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("5671,Struts,Cobwoy,xxxtrueman@tinder.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
