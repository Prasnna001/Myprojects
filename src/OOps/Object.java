package OOps;

class main{
    int a,b ;
    String name;

}

public class Object {
    public static void main(String[] args) {
        main m = new main(); // here we create a object so we can acess all the elements inside the class
        m.a=10;  // assinging value to the varible using  creating object
        m.b =50;
        m.name ="Prasanna";
        System.out.println(m.a +" "+ m.b +" " + m.name); //print the value
    }
}
