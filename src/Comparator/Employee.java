package Comparator;

/**
 * Created by shubh on 10/03/18.
 */
public class Employee {
    private String id;
    private String firstName;
    private String lastName;

    public Employee(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "com.Comparator.Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee emp=(Employee) obj;
            return emp.id.equals(this.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashcode = 0;

        hashcode = id.hashCode();
        hashcode += id.hashCode();

        return hashcode;
    }
}
