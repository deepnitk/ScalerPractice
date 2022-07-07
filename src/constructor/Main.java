package constructor;

public class Main {
    public static void main(String[] args) {
        Student nandini = new Student("nandini", "pune");
        // nandini.name = "Nandini";
        nandini.email = "nandidni@gmail.com";
        // nandini.address = "pune";
        nandini.batch = "June22";
        nandini.state = "ACTIVE";
        nandini.pauseCourse();
        nandini.Nandini();

        System.out.println(nandini.name);
        System.out.println(nandini.address);

        Student deep = new Student(nandini);
        System.out.println(deep.name);
        System.out.println(deep.address);

    }
}
