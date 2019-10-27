import org.joda.time.DateTime;

public class Person {
    private int id;
    private String fio;
    private DateTime dateOfBirth;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
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
}


//    PersonListOur p = new PersonListOur();

//    Person np = new Person("q", "737373", "sex");
//    p.add(np);
//
//        p.addPerson(new Person("p1", new DateTime(2000, 5, 12, 0,0), Person.Sex.Male));
