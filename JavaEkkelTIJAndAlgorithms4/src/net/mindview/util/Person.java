package net.mindview.util;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class Person {
    public final String first;
    public final String last;
    public final String address; // И t д.
    public static final Person NULL = new NullPerson();
    public Person(String first, String last, String address){
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }
        @Override
        public String toString() { return "NullPerson"; }
    }
}
