package Controller;

import java.util.List;
import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();
    public void addStudent(Student s);
    public boolean deleteStudent(Long id);
}