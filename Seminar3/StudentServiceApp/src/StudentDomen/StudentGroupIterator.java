package StudentDomen;

//Итератор для группы студентов 

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    //Конструктор 
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        //Счетчик с 0
        this.counter = 0;
    }
    @Override
    public boolean hasNext() {
        //Счетчик возвращается, пока значение меньше числа студентов
       return counter<students.size();
    }

    @Override
    public Student next() {
        //Если метод hasNext возвращает ложное значение, то возвращаем ноль 
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
    
}
