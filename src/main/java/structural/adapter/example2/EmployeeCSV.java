package structural.adapter.example2;

import java.util.StringTokenizer;


public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values,",");
        if(tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeCSV{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

