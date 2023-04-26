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

    //метод для получения значения поля аge
    @Override
    public int getAge() {
        return super.getAge();
    }

    //метод для получения значения поля FirstName
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    //метод для получения значения поля SecondName
    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    //метод для установки значения поля age
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    //метод для установки значения поля firstName
    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    //метод для установки значения поля secondName
    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }
    
}
