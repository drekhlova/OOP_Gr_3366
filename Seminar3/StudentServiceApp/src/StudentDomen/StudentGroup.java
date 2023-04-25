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

    //Получаем список студентов
    public List<Student> getStudents() {
        return students;
    }

    //Устанавливается значение для списка студентов
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Получаем groupID
    public long getGroupId() {
        return groupID;
    }
    //Устанавливается значение groupID
    public void setGroupId(long groupID) {
        this.groupID = groupID;
    }

    //Получаем groupSize
    public int getGroupSize() {
        return groupSize;
    }
    //Устанавливается значение groupSize
    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    //Итератор
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    //На экран
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




