package oops.polymorphism;

import java.util.List;

public class Main {
    public static void changePasswordOfAllUser(List<User> users) {
        for (User user: users) {
            user.changeEmail();
            //We are checking if user is a student in runtime
            if (user instanceof Student) {
                System.out.println("I am a student");
                Student student = (Student) user;
                student.changeBatch();
            }
        }
    }
    public static void main(String[] args) {
        User u1 = new TA();
        // u1.expertise = "Java"; //Throws Error
        User u2 = new Student();
        User u3 = new Mentor();
        List<User> users = List.of(
                u1,
                u2,
                u3,
                new Student(),
                new Mentor()
        );
        changePasswordOfAllUser(users);
    }
}
