package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;

//Класс Controller

public class Controller {

    private List<Student> students; 
    private iGetView view; //Подключение view
    private iGetModel model; //Подключение model

    //Конструктор передает контроллеру model и view и инициализирует пустой список студентов, чтобы класть туда копию данных из model
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    } 

    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    //Проверка корректности данных
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Отправка данных в view
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    //Подключение команд
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    System.out.println("Введите номер ID студента, которого вы хотите удалить из списка: ");
                    Scanner scanner = new Scanner(System.in);
                    long idToDelete = scanner.nextLong();
                    boolean delete = model.deleteStudent(idToDelete);
                    if (delete) {
                        System.out.println("Студент с ID " + idToDelete + " успешно удален из списка!");
                    } else {
                        System.out.println("Студент с ID " + idToDelete + " не найден!");
                    }
                    break;
            }
        }
    }
}
