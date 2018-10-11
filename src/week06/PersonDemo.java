package week06;

public class PersonDemo
{
    public static void main(String[] args)
    {
        PersonBuilder builder = new PersonBuilder();

//        Person person = new Person("Jose", "Smith");

        Person person = builder
                .withFirstName("Jose")
                .withLastName("Last Name").build();

        System.out.print(person);

        Person person2 = builder.reset().withFirstName("Michel").build();
        System.out.print(person2);
    }
}
