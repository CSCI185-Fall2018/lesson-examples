package week03;

class Driver
{
    public static void main(String[] args)
    {

        Person p1 = new Person();
        p1.setFirstName("Rajan");
        p1.setLastName("Khullar");
        System.out.println(p1);

        Person s2 = new Student();
        ((Student) s2).hello();

        System.out.println(s2 instanceof Person);

        Animal f1 = new Fish();
        Fish f2 = new Fish();
        FlyInf f3 = new Fish();
        SwimInf f4 = new Fish();

        Animal[] animals = new Animal[3];
        animals[0] = new Fish();
        animals[1] = new Parrot();
        animals[2] = new Dog();

        for (Animal animal: animals)
            System.out.println(animal);

    }
}
