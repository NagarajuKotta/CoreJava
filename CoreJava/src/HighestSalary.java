import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalary {
    public static void main(String[] args) {

        int n = 2;

        Employee emp1 = new Employee(3, "ram", 36500);
        Employee emp2 = new Employee(2, "nag", 136500);
        Employee emp3 = new Employee(4, "param", 80000);
        Employee emp4 = new Employee(1, "lakshmi", 180000);
        Employee emp5 = new Employee(5, "Niveditha", 236500);
        Employee emp6 = new Employee(6, "Satwik", 200000);
        Employee emp7 = new Employee(8, "kiran", 47500);
        Employee emp8 = new Employee(7, "sobha", 86500);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);

        highestSalary(empList, n);
    }

    public static void highestSalary(List<Employee> list, int n) {
        List<Employee> empSortList = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(empSortList);
        System.out.println("Highest salary at position "+n+" employee details : "+empSortList.get(n-1));
    }
}
