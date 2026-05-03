public class Teacher extends User {
    private String[] teachingCourses;
    private int courseCount;

    public Teacher(String name, String email) {
        super(name, email);
        teachingCourses = new String[10];
        courseCount = 0;
    }

    public void createCourse(String courseName) {
        if (courseCount < teachingCourses.length) {
            teachingCourses[courseCount] = courseName;
            courseCount++;
            System.out.println(name + " created course: " + courseName);
        } else {
            System.out.println("Cannot create more courses. Course limit reached.");
        }
    }

    @Override
    public void performRole() {
        System.out.println("\n--- Teacher Role ---");
        showBasicInfo();

        if (courseCount == 0) {
            System.out.println("No courses created.");
        } else {
            System.out.println("Courses Teaching:");
            for (int i = 0; i < courseCount; i++) {
                System.out.println("- " + teachingCourses[i]);
            }
        }
    }
}
