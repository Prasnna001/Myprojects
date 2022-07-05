package OOps;
class A
{
    int a =10;

    public A() {
        System.out.println("default constuctor called");
    }
}

class B extends A
{
    public B(int i) {
        System.out.println(i);
    }
}

public class Inheritance {
    public static void main(String[] args) {

A b= new B(3);
b.a=50;

        System.out.println(b.a);

    }
}
