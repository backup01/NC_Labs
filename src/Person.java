import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.Years;

public class Person {
    private int id;
    private String name;
    private DateTime dateOfBirth;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return new Period(dateOfBirth, DateTime.now()).getYears();
    }
}


//    PersonList p = new PersonList();

//    Person np = new Person("q", "737373", "sex");
//    p.add(np);
//
//        p.addPerson(new Person("p1", new DateTime(2000, 5, 12, 0,0), Person.Sex.Male));
