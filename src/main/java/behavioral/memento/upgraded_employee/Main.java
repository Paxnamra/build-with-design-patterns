package behavioral.memento.upgraded_employee;

public class Main {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("412-00-98441");

        System.out.println("Employee before save: " + "\t\t\t\t\t" + employee);
        caretaker.save(employee);

        employee.setPhone("000-00-0000");

        caretaker.save(employee);

        System.out.println("Employee changed phone number save: " + "\t" + employee);

        employee.setPhone("99-991-9876");   //<--- not called save
        caretaker.revert(employee);

        System.out.println("Reverted to save point: " + "\t\t\t\t" + employee);

        caretaker.revert(employee);
        System.out.println("Reverted to original: " + "\t\t\t\t\t" + employee);
    }
}
