public class SuperKeyword 
{
    public static void main(String args[]) 
    {
        TheCar obj = new TheCar();
        obj.vehicalSound();
        obj.SupervehicalSound();
    }
}

class TheSound 
{
    public void vehicalSound() 
    {
        System.out.println("The sound of vehical");
    }
}

class TheCar extends TheSound 
{
    public void vehicalSound() 
    {
        System.out.println("The Sound of Car");
    }

    public void SupervehicalSound() 
    {
        super.vehicalSound();
    }
}
