package week06;

public class PersonBuilder extends Person
{

    public PersonBuilder reset()
    {
        first_name = null;
        last_name = null;
        date_of_birth = null;
        gender = null;
        height = 0;
        eye_color = null;
        return this;
    }

    public Person build()
    {
        return new Person(first_name, last_name, date_of_birth, gender, height, eye_color);
    }

    public PersonBuilder withFirstName(String name)
    {
        this.first_name = name;
        return this;
    }

    public PersonBuilder withLastName(String name)
    {
        this.last_name = name;
        return this;
    }

}
