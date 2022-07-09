package overloading;

public class A {
    public void print() {
        System.out.println("hello world");
    }

    public void print(String name) {
        System.out.println("Hello "+name);
    }
}
