package week03;

class Fish extends Animal implements FlyInf, SwimInf
{

    public void fly()
    {
        System.out.println("i am a flying fish");
    }

    public void swim()
    {

    }

    public String toString()
    {
        return "override to string for fish";
    }
}
