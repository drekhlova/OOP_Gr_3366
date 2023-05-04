package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import Controller.iGetModel;

//Класс Model

public class Model implements iGetModel {

    //Получение всех студентов из модели
    /*private List<Student> students; //список студентв с ID

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }
}
*/

/*
     // Хранилище студентов v.1
    private HashMap<Long, Student> students;

    public Model() {
        students = new HashMap<>();
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

*/
    //Хранилище студентов v.2
     private HashMap<Long, Student> students; //список студентв с ID

     public Model(List<Student> students) {
        HashMap<Long, Student> stud = new HashMap<>();
        for (Student s : students) {
            stud.put(s.getStudentID(), s);
        }
        this.students = stud;
    }
 
    public List<Student> getAllStudent()
    {
        List<Student> studs = new ArrayList<>();
        for (Long id : this.students.keySet()) {
            studs.add(this.students.get(id));
        }
        return studs;
    }

    @Override
     public boolean deleteStudent(Long id) {
         students.remove(id);
         return false;
    }
}