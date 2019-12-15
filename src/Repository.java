import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private Person[] persons = new Person[10];
    private int length = 0;

    public IPersonSort sorter;

    //получаем длину списка
    public int getLength() {
        return length;
    }

    /**
     * Добавляет объект класса Person в список
     *
     * @param person объект класса Person, который будет добавлен
     */
    public void addPerson(Person person) {
        if (length >= persons.length) {
            persons = Arrays.copyOf(persons, persons.length + (persons.length >> 1));
        }

        persons[length] = person;
        length++;
    }

    /**
     * Удаление объекта c указанным id из list
     *
     * @param id для удаления
     */
    public void deleteById(int id) {
        if (id <= length) {
            length--;
            for (int i = id - 1; i < length; i++) {
                persons[i] = persons[i + 1];
            }

            persons[length] = null;
        }
    }

    /**
     * Поиск объекта класса Person в списоке по его id
     * @param id id объекта, который необходимо найти
     * @return найденный объект или null
     */
    public Person getById(int id)
    {
        if (id < length) {
            return persons[id];
        }
        return null;
    }

    /**
     * Сортировка массива по возрасту
     */
    public void sortByAge()
    {
        persons = sorter.sort(Arrays.copyOf(persons, length), new PersonAgeComparator());
    }

    /**
     * Сортровка массива по полю имени
     */
    public void sortByName()
    {
        persons = sorter.sort(Arrays.copyOf(persons, length), new PersonNameComparator());
    }

    /**
     * Сортровка массива по полю date of birth
     */
    public void sortByDateOfBirth()
    {
        persons = sorter.sort(Arrays.copyOf(persons, length), new PersonDateOfBirthComparator());
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < length; i++) {
            res += String.format(" 1.Name: %s; \n 2.Date of birth: %s; \n 3.Sex: %s \n ------- \n", persons[i].getName().toString(), persons[i].getDateOfBirth().toString("dd.MM.yyyy"), persons[i].getSex().toString());
        }

        return res;
    }
}