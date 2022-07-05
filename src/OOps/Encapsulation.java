package OOps;

class Main
{
    private int age;
    private String name;

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}



public class Encapsulation {
    public static void main(String[] args) {
    Main main = new Main();
    main.setAge(22);
    main.setName("prasanna");
        System.out.println(main.getAge() +" -> "+ main.getName());
    }
}
