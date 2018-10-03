package Comparator;

import java.util.Comparator;

/**
 * Created by shubh on 10/03/18.
 */
public class FirstNameSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee anEmployee,Employee anotherEmployee) {
        return anEmployee.getFirstName().compareTo(anotherEmployee.getFirstName());
    }
}
