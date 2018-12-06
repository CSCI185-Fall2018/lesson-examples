package week13;

class Vehicle
{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void accelerate()
    {
        speed++;
    }

    public void decelerate()
    {
        speed--;
    }
}