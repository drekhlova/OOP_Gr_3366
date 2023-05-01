package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService emploeeService = new EmploeeService();

    @Override
    public void create(String firstName, String secondName, int age, String academicDegree) {
        emploeeService.create(firstName, secondName, age, academicDegree);
    }

    static public <T> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 10 000 руб.");
    }

    static public <T extends Number> double mean(T[] num) {
        double sum = 0.0;
        for(int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
    
}
