package test;

class A{
    int cost = 10;
    A(){
        System.out.println("A");
        outputCost();
    }
    void outputCost(){
        System.out.println(cost);
    }
}

class B extends A {
    int cost = 20;
    B(){
        System.out.println("B");
        outputCost();
    }
    void outputCost(){
        System.out.println(cost);
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.cost);

    }
}
