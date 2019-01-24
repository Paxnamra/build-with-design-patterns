package behavioral.memento.upgraded_employee;

import java.util.Stack;

//caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());

    }

    public void revert(Employee employee) {
        employee.undoSave(employeeHistory.pop());
    }
}
