import org.joda.time.LocalDate;
import org.joda.time.Period;

import java.util.ArrayList;

public class Person {
    //поле, хранящее идентификатор
    private int id;
    //поле, хранящее имя
    private String name;
    //поле, хранящее дату рождения
    private LocalDate dateOfBirth;
    //поле, хранящее пол
    private String sex;

    //getters & setters для полей класса
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //Вычисление возраста
    public int getAge() {
        return new Period(dateOfBirth, LocalDate.now()).getYears();
    }

    //Конструктор Person
    public Person(int id, String name, LocalDate dateOfBirth, String sex){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    //Перевод информации о Person в строку
    public String toString() {
        return String.format("1.ID: %s; \n 2.Name: %s; \n 3.Date of birth: %s; \n 4.Sex: %s", id, name, dateOfBirth.toString("dd.MM.yyyy"), sex.toString());
    }
}
