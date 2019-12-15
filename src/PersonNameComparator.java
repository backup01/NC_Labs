public class PersonNameComparator extends IPersonComparator{

    public int compare(Person personOne, Person personTwo) {
        return personOne.getName().compareTo(personTwo.getName());
    }
}