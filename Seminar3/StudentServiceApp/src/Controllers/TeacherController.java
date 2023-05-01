package Controllers;

import StudentDomen.User;
import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher> {
    // Инициализация TeacherService
    private final TeacherService tchrsService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age, String academicDegree) {
        tchrsService.create(firstName, secondName, age, academicDegree);
    }

    public TeacherService getTchrsService() {
        return tchrsService;
    } 
}

