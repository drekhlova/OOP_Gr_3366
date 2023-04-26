package StudentDomen;

//Класс пользователь

public class User {
    private String firstName;
    private String secondName;
    private int age;

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    //метод для получения значения поля firstName
    public String getFirstName() {
        return firstName;
    }

    //метод для установки значения поля firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //метод для получения значения поля secondName
    public String getSecondName() {
        return secondName;
    }

    //метод для установки значения поля secondName
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    //метод для получения значения поля age
    public int getAge() {
        return age;
    }

    //метод для установки значения поля age
    public void setAge(int age) {
        this.age = age;
    }

    //Выводим на экран
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
