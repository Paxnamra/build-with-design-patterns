package behavioral.memento.plain_employee;

import java.io.*;

//memento
public class Demo {

    private static Employee deserialize(){

        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee/ser.");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static void serialize(Employee emp) {

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee/ser.");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Jenny");
        emp.setPhone("003-12-5568");
        emp.setAddress("Wenus, unknown localization st 0/2");

        serialize(emp);

        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());

    }
}

//TODO path localizaton error to fix