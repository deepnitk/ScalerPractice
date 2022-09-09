package oops.constructor;

public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Copy oops.constructor
    Student(Student other) {
        this.name = other.name;
        this.address = other.address;
        this.email = other.email;
        this.batch = other.batch;
        this.state = other.state;
    }

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "PAUSED";
    }

    void Nandini() {
        System.out.println("Nandini");
    }

}