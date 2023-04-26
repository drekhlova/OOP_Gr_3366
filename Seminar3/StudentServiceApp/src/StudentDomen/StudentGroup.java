package StudentDomen;

//Класс группа студентов

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private long groupID;
    private int groupSize;

    public StudentGroup(List<Student> students, long groupID, int groupSize) {
        this.students = students;
        this.groupID = groupID;
        this.groupSize = groupSize;
    }

    //метод для получени значения поля Students
    public List<Student> getStudents() {
        return students;
    }

    //метод для установки значения поля Students
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //метод для получени значения поля groupID
    public long getGroupId() {
        return groupID;
    }

    //метод для установки значения поля groupID
    public void setGroupId(long groupID) {
        this.groupID = groupID;
    }

    //метод для получени значения поля groupSize
    public int getGroupSize() {
        return groupSize;
    }
    //метод для установки значения поля groupSize
    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    //Итератор
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    //Выводим на экран
    @Override
    public String toString() {
        return "StudentGroup{" 

            + "groupID = " + getGroupId()
            + ". Students" + getStudents() +
            '}';
    }

    //Сортировка
    @Override
    public int compareTo(StudentGroup o) {
        if (getGroupSize() == o.getGroupSize()) {
            if (this.groupID == o.groupID) {
                return 0;
            }
            if (this.groupID < o.groupID) {
                return -1;
            }
            return 1;
        }
        if (getGroupSize() < o.getGroupSize()) {
            return -1;
        }
        return 1;
    }
}




