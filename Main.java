public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rahim", "rahim@email.com");
        Teacher teacher = new Teacher("Karim Sir", "karim@email.com");
        Administrator admin = new Administrator("Admin One", "admin@email.com");

        student.enrollCourse("Java Programming");
        student.enrollCourse("Database Management");
        student.setGrade(88.5);

        teacher.createCourse("Object Oriented Programming");
        teacher.createCourse("Software Engineering");

        admin.addUser("Rahim");
        admin.addUser("Karim Sir");
        admin.deleteUser("Old User");

        User[] users = new User[3];
        users[0] = student;
        users[1] = teacher;
        users[2] = admin;

        System.out.println("\n===== POLYMORPHISM DEMO =====");

        for (int i = 0; i < users.length; i++) {
            users[i].performRole();
        }

        System.out.println("\n===== ENCAPSULATION DEMO =====");
        student.viewGrades();
        System.out.println("Grade accessed through getter: " + student.getGrade());
    }
}
