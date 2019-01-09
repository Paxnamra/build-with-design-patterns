package structural.adapter.example2;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.employeeCSV = employeeFromCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.getId() + "";
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeAdapterCSV{");
        sb.append("employeeCSV=").append(employeeCSV);
        sb.append('}');
        return sb.toString();
    }
}

