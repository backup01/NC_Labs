//интерфейс предназначенный для сортровки списка элементов, состоящих из объектов класса Person
public interface IPersonSort {

    /**
     * Сортирока списка
     * @param list список элементов
     * @param comparator компаратор для сортировки
     */
    public Person[] sort(Person[] list, IPersonComparator comparator);
}
