package structural.adapter.example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }
}
