package constructorchaining;

public class B extends A {
    private int c;
    B() {
        super("deep");
        System.out.println("Constructor of B");
    }
}
