package test;
public class intertest {
    public static void main(String[] args) {
    Parent a = new Child();
    Child b = new Child();
        System.out.println(a.getX() + a.x + b.getX() + b.x);

    }

}

class Parent{
    int x = 3;
    int getX(){
        return x * 2;
    }
}
class Child extends Parent{
    int x = 7;
    int getX(){
        return x * 3;
    }
}