import org.joda.time.LocalDate;
import org.joda.time.Period;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Person> persons = new ArrayList<>(10);
        persons.add(new Person (1,"Steven king", new LocalDate(1995, 02, 19),"Male"));
        persons.add(new Person (2,"Neena Kochhar", new LocalDate(1998, 07, 31),"Female"));
        persons.add(new Person (3,"Lex Haan", new LocalDate(1993, 05, 12),"Male"));
        persons.add(new Person (4,"Alexander Hunold", new LocalDate(1996, 12, 15),"Male"));
        persons.add(new Person (5,"Bruce Ernst", new LocalDate(1984, 01, 11),"Male"));
        persons.add(new Person (6,"David Austin", new LocalDate(1975, 10, 19),"Male"));
        persons.add(new Person (7,"Valli Pataballa", new LocalDate(1997, 07, 23),"Female"));
        persons.add(new Person (8,"Diana Lorentz", new LocalDate(1994, 02, 27),"Female"));
        persons.add(new Person (9,"Nancy Greenberg", new LocalDate(1990, 04, 16),"Female"));
        persons.add(new Person (10,"Daniel Faviet", new LocalDate(1995, 02, 18),"Female"));
    }
//    PersonList p = new PersonList();

//    Person np = new Person("q", "737373", "male");
//    p.add(np);
//
//        p.addPerson(new Person("p1", new DateTime(2000, 5, 12, 0,0), Person.Sex.Male));
}
