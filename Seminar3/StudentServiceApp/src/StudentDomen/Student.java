package StudentDomen;

//Класс студент

public class Student extends User implements Comparable<Student> {
    private long studentID;

    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    //метод для получения значения поля StudentID
    public long getStudentID() {
        return studentID;
    }

    //метод для установки значения поля studentID
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    //Вывод на экран
    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }

    //Сортировка
    @Override
    public int compareTo(Student o) {
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}
