package StudentDomen;

//Итератор для потока студентов

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentSteam;

    //Конструктор
    public StudentSteamIterator(List<StudentGroup> studentSteam) {
        this.studentSteam = studentSteam;
        //Счетчик с 0
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        //Счетчик возвращается, пока он меньше числа студентов (потока)
        return counter < studentSteam.size();
    }

    @Override
    public StudentGroup next() {
        //Если метод hasNext возвращает ложное значение, то возвращаем ноль
        if (!hasNext()) {
            return null;
        }
        return studentSteam.get(counter++);
    }

}
