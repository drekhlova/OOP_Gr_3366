import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        //User u1 = new User("Сергей","Иванов",25);
        //Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        //Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        //Student s3 = new Student("Иван", "Петров", 22, (long)121);
        //Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        //Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        //Student s6 = new Student("Елена", "Незабудкина", 23, (long)104);
        //Student s7 = new Student("Николай", "Незабудкин", 23, (long)107);
        //Student s8 = new Student("Федор", "Капустин", 21, (long)162);
        //Student s9 = new Student("Ирина", "Кабакина", 25, (long)100);
        //Student s10 = new Student("Борис", "Катков", 24, (long)201);
        //Student s11= new Student("Лариса", "Романова", 23, (long)210);
        //Student s12 = new Student("Нелли", "Фрустадо", 24, (long)305);
        //Student s13 = new Student("Николай", "Бабко", 25, (long)150);
        //Student s14 = new Student("Елизавета", "Коняева", 21, (long)155);

        //Первая группа студентов
        //List<Student> listStud1 = new ArrayList<Student>();
        //listStud1.add(s1);
        //listStud1.add(s2);
        //listStud1.add(s3);
        //listStud1.add(s4);
        //listStud1.add(s5);
        //listStud1.add(s6);

        //Вторая группа студентов
        //List<Student> listStud2 = new ArrayList<Student>();
        //listStud2.add(s7);
        //listStud2.add(s8);
        //listStud2.add(s9);
        //listStud2.add(s10);
        //listStud2.add(s11);

        //Третья группа студентов
        //List<Student> listStud3 = new ArrayList<Student>();
        //listStud3.add(s12);
        //listStud3.add(s13);
        //listStud3.add(s14);

      
        //StudentGroup group = new StudentGroup(listStud1, 1, 6);
        //for(Student stud : group) {
        //    System.out.println(stud);
        //}

        //System.out.println("============= После сортировки =============");
        //Collections.sort(group.getStudents());
        //for(Student stud : group) {
        //    System.out.println(stud);
        //}
        
        //построчный вывод на экран созданных персонажей
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);

        //StudentGroup group2 = new StudentGroup(listStud2, 2, 5);
        //StudentGroup group3 = new StudentGroup(listStud3, 3, 3);

        //List<StudentGroup> studentSteam1 = new ArrayList<StudentGroup>();
        //studentSteam1.add(group);
        //studentSteam1.add(group2);
        //studentSteam1.add(group3);

        //System.out.println("============= Группы студентов =============");

        //StudentSteam studentSteam = new StudentSteam(studentSteam1, 2);
        //for (StudentGroup groupsOfSteam : studentSteam) {
        //    System.out.println(groupsOfSteam);
        //}
        
        //System.out.println("============= После сортировки по количеству студентов в группе =============");
        //Collections.sort(studentSteam.getStudentSteam());
        //for (StudentGroup groupsOfSteam : studentSteam) {
        //    System.out.println(groupsOfSteam);
        //}

        Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        //EmploeeController contrEmp = new EmploeeController();
        EmploeeController.paySalary(peron1);
        //contrEmp.paySalary(s1);

        Integer studHour[] = {124,234,231,1,45};
        System.out.println(EmploeeController.mean(studHour));

        Double emplSalary[] = {12555.23,34213.5,10000.0};
        System.out.println(EmploeeController.mean(emplSalary));
    }
}

