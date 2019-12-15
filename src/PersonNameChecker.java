public class PersonNameChecker {

    public boolean check(Person person, Object obj) {
        boolean res = person.getName().contains((String)obj);
        return res;
    }

}
