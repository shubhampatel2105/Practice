package Comparator;

import java.util.Comparator;

/**
 * Created by shubh on 10/03/18.
 */
public class IdSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee anEmployee,Employee anotherEmployee) {
        return anEmployee.getId().compareTo(anotherEmployee.getId());
    }
}
