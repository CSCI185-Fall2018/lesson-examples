package week01;

class Person extends Object
{
    // this class is immutable

    private String name;
    private int age;

    public Person()
    {
//       name = null;
//       age = 0;

        this(null, 0);

    }

    public Person(String name)
    {
        this(name, 0);
    }

    public Person(String name, int age)
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