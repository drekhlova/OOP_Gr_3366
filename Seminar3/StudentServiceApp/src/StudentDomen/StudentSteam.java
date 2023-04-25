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

    //Получаем поток студентов
    public List<StudentGroup> getStudentSteam() {
        return studentSteam;
    }

    //Установка значения для потока студентов
    public void setStudentSteam(List<StudentGroup> studentSteam) {
        this.studentSteam = studentSteam;
    }

    //Получаем номер потока
    public int getSteamNumber() {
        return steamNumber;
    }

    //Установка номера потока
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
        
       
