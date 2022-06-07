package entities;

public class Person implements Comparable<Person> {

    private String Name;
    private String sex;

    public Person(String name, String sex) {
        this.Name = name;
        this.sex = sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(Person person) {
        return this.Name.compareTo(person.getName());
    }

    @Override
    public String toString() {
        return  "Name: "
                + Name
                + " sex: "
                + sex;
    }
}
