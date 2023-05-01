package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;
 
public class TeacherService implements iUserService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, String secondName, int age, String academicDegree) {
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegree);
        count++;
       teachers.add(per);  
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    //Метод сортировки преподавателей по ФИО
    public List<Teacher> getSortedByFIOTeacher() {
        List<Teacher> tchrs = new ArrayList<>(teachers);
        tchrs.sort(new UserComparator<Teacher>());
        return tchrs;
    }
}
