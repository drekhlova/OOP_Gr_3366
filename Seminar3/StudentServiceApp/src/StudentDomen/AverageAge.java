package StudentDomen;

import java.util.Collection;

//Класс AverageAge для подсчета среднего возраста 

public class AverageAge <T extends User> {
    private Collection<T> collection;


    public AverageAge(Collection<T> collection) {
        this.collection = collection;
    }

    public double findAverageAge() {
        int sum = 0;
        for (T user : collection) {
            sum += user.getAge();
        }
        return (double) sum / collection.size();
    }

    @Override
    public String toString() {
        return "Средний возраст: " + findAverageAge();
    }
}