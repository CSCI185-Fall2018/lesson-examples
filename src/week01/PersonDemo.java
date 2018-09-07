package week01;

class PersonDemo
{
    public static void main(String[] args)
    {
        Person[] people = new Person[3];

        people[0] = new Person();
        people[1] = new Person("Rajan");
        people[2] = new Person("Smith", 23);

        for(Person person: people)
            System.out.println(person);
    }
}