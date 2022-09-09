package oops.abstractclasses;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        // instructor.name = "deep";
        instructor.setName("deep");
        // instructor.email = "deep@gmail.com";
        instructor.setEmail("deep@gmail.com");
        // instructor.assignedBatch = "june22";
        instructor.setAssignedBatch("june22");
        // instructor.password = "sonu";
        instructor.setPassword("sonu");
        // instructor.topic = "lld";
        instructor.setTopic("lld");
        // instructor.description = "super cool";
        instructor.setDescription("super cool");

        // User user = new User(); // we cannot create an object of User as it is an abstarct class
        // user.name = "Nandini";
        // user.setName("Nandini");

        Mentor mentor = new Mentor();
        //mentor.name = "Chandan";
        mentor.setName("Chandan");
        // mentor.description = "Boss";
        mentor.setDescription("Boss");
        // mentor.email = "chandan@gmail.com";
        mentor.setEmail("chandan@gmail.com");

    }
}
