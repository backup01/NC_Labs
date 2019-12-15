public class PersonDateOfBirthComparator extends IPersonComparator{

    public int compare(Person personOne, Person personTwo) {
        return personOne.getDateOfBirth().compareTo(personTwo.getDateOfBirth());
    }
}
