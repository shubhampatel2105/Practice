package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by shubh on 10/03/18.
 */
public class EmployeeSort {

    public static void main(String[] args) {
        Employee emp1=new Employee("1","aaa","bbb");
        Employee emp2=new Employee("2","abc","zxc");
        Employee emp3=new Employee("1","aab","cab");

        List<Employee> employees=new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Remove Duplicates");
        HashSet<Employee> set=new HashSet<Employee>(employees);
        printEmployee(set);

        //Remove duplicates and put it back in arraylist.
        employees=new ArrayList<>(set);


        System.out.println("Unsorted Employee");
        printEmployee(employees);
        System.out.println("Sorted byId");
        Collections.sort(employees,new IdSorter());
        printEmployee(employees);
        System.out.println("Sorted byFirstName");
        Collections.sort(employees,new FirstNameSorter());
        printEmployee(employees);

    }

    private static void printEmployee(List<Employee> employees) {
        for (Employee e:employees) {
            System.out.println(e);

        }
    }
    private static void printEmployee(HashSet<Employee> employees) {
        for (Employee e:employees) {
            System.out.println(e);

        }
    }
}
