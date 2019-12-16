import org.joda.time.LocalDate;


public class Main {
    public static void main (String[] args){
        Repository persons = new Repository();

        persons.addPerson(new Person (1,"Steven king", new LocalDate(1995, 02, 19),"Male"));
        persons.addPerson(new Person (2,"Neena Kochhar", new LocalDate(1998, 07, 31),"Female"));
        persons.addPerson(new Person (3,"Lex Haan", new LocalDate(1993, 05, 12),"Male"));

        System.out.println(persons.toString());

        persons.sortByAge();
        System.out.println(persons.toString());

        persons.sortByName();
        System.out.println(persons.toString());

        persons.sortByDateOfBirth();
        System.out.println(persons.toString());
    }
}
