package week13;

class Airplane extends Vehicle implements Flyable
{

    private boolean gearStatus;

    public void fly()
    {
        System.out.println("i am flying");
    }

    public boolean gearStatus()
    {
        return gearStatus;
    }

    public void gearUp()
    {
        gearStatus = true;
    }

    public void gearDown()
    {
        gearStatus = false;
    }

    public static void main(String[] args)
    {
        Airplane airplane = new Airplane();
        airplane.accelerate();
        airplane.fly();
        airplane.gearUp();
    }
}