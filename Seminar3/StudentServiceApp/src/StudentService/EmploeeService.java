package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

public class EmploeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> employees;
    public EmploeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, count);
        count++;
        employees.add(per);
    }
    
    public List<Employee> getSoredByFIOStudentGroup(int numberGroup) {
        List<Employee> students = new ArrayList<>(employees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }
}
