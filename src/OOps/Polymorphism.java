package OOps;

class Animal
{
    void zoo()
    {
        System.out.println("there are plenty of Animals there");
    }
}
class Lion extends Animal
{
    void zoo()
    {
        System.out.println("Lion is the king of the Jungle");
    }
}

class tiger extends Animal
{
    void zoo()
    {
        System.out.println("tiger is powerfull animal in the world");
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal=new Lion();
        animal.zoo();
        animal = new tiger();
        animal.zoo();
    }
}
