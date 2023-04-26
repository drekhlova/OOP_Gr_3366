package StudentDomen;

import java.util.Iterator;
import java.util.List;

//Класс поток студентов

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> studentSteam;
    private int steamNumber;

    //Конструктор
    public StudentSteam(List<StudentGroup> studentSteam, int steamNumber) {
        this.studentSteam = studentSteam;
        this.steamNumber = steamNumber;
    }

    //метод для получения значения поля studentSteam
    public List<StudentGroup> getStudentSteam() {
        return studentSteam;
    }

    //метод для установки значения поля studentSteam
    public void setStudentSteam(List<StudentGroup> studentSteam) {
        this.studentSteam = studentSteam;
    }

    //метод для получения значения поля steamNumber
    public int getSteamNumber() {
        return steamNumber;
    }

    //метод для установки значения поля steamNumber
    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    //Итератор
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(studentSteam);
    }

    @Override
    // Выводим на экран
    public String toString() {
        return "StudentSteam{"

                + "StudentSteam=" + getStudentSteam()
                + ", steamNumber=" + getSteamNumber() +
                '}';

    }
}
        
       
