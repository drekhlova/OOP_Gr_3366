package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    /*private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }
    */

     // Хранилище студентов
     private Map<Long, Student> students;

     public Model() {
         students = new HashMap<>();
     }
 
     @Override
     public void addStudent(Student student) {
         students.put(student.getStudentID(), student);
     }
 
     @Override
     public boolean deleteStudent(Long id) {
         students.remove(id);
         return false;
     }
 
     @Override
     public List<Student> getAllStudents() {
         return List.copyOf(students.values());
     }
}