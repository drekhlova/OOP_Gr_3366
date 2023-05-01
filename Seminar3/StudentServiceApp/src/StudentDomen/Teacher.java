package StudentDomen;

//Класс преподаватель 

public class Teacher extends User {

    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    //Метод для получения значение поля TeacerId
    public int getTeacerId() {
        return teacherId;
    }

    //Метод для установления значение поля TeacerId
    public void setTeacerId(int teacerId) {
        this.teacherId = teacerId;
    }

    //Метод для получения значение поля Level
    public String getLevel() {
        return academicDegree;
    }

    //Метод для установления значение поля Level
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }
    
}
