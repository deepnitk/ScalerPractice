package oops.constructorchaining;

public class A {
    private int a;
    private int b;
//    A() {
//        System.out.println("Constructor of A");
//    }
    A(String name) {
        System.out.println(name);
        this.a = 110;
    }
}
