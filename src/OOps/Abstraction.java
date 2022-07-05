package OOps;

abstract class demo
{
    public abstract void show();
    static int a =10;

}


public class Abstraction extends demo{
    public static void main(String[] args) {
        Abstraction abstraction=new Abstraction();
        abstraction.show();
        a=10;
        System.out.println(a);
    }

    @Override
    public void show() {
        System.out.println("Abstraction Achieved ");
    }
}
