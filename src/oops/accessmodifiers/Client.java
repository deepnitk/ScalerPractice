package oops.accessmodifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "deep";
        // student.address = "pune"; will not work
        student.email = "ratnadeep.konar@gmail.com";
    }
}
