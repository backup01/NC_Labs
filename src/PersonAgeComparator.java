public class PersonAgeComparator extends IPersonComparator {

    public int compare(Person personOne, Person personTwo) {
        return personOne.getAge() - personTwo.getAge();
    }
}
