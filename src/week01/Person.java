package week01;


// by default any custom class extends Object
class Person
{
    // this class is immutable

    private String name;
    private int age;

    Person()
    {
        this(null, 0);
    }

    Person(String name)
    {
        this(name, 0);
    }

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return "Person: " + name + ", " + age;
    }

}