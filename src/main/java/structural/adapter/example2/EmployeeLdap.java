package structural.adapter.example2;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeLdap{");
        sb.append("cn='").append(cn).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", givenName='").append(givenName).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
