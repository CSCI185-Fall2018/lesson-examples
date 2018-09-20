package week03;

class Person
{
    private String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString()
    {
        return String.format("Person {name: %s %s}", firstName, lastName);
    }

    public boolean equals(Person other)
    {
        return firstName.equals(other.lastName) && lastName.equals(other.lastName);
    }
}