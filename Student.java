public class Student extends User {
    private String[] enrolledCourses;
    private int courseCount;

    private double grade;

    public Student(String name, String email) {
        super(name, email);
        enrolledCourses = new String[10];
        courseCount = 0;
        grade = 0.0;
    }

    public void enrollCourse(String courseName) {
        if (courseCount < enrolledCourses.length) {
            enrolledCourses[courseCount] = courseName;
            courseCount++;
            System.out.println(name + " enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll. Course limit reached.");
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    public double getGrade() {
        return grade;
    }

    public void viewGrades() {
        System.out.println(name + "'s grade: " + grade);
    }

    @Override
    public void performRole() {
        System.out.println("\n--- Student Role ---");
        showBasicInfo();

        if (courseCount == 0) {
            System.out.println("No enrolled courses.");
        } else {
            System.out.println("Enrolled Courses:");
            for (int i = 0; i < courseCount; i++) {
                System.out.println("- " + enrolledCourses[i]);
            }
        }
    }
}
