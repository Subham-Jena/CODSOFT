import java.util.ArrayList;

public class Database {
    private static ArrayList<Course> courseDatabase;
    private static ArrayList<Student> studentDatabase;

    public static ArrayList<Course> getCourseDatabase() {
        return courseDatabase;
    }

    public static ArrayList<Student> getStudentDatabase() {
        return studentDatabase;
    }

    public static void initialize() {
        courseDatabase = new ArrayList<>();
        studentDatabase = new ArrayList<>();
    }

    public static void addCourse(Course course) {
        courseDatabase.add(course);
    }

    public static void addStudent(Student student) {
        studentDatabase.add(student);
    }

    public static Course getCourse(String code) {
        for (Course course : courseDatabase) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    public static Student getStudent(String id) {
        for (Student student : studentDatabase) {
            if (student.getID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<Course> getCourseListing() {
        ArrayList<Course> courseListing = new ArrayList<>(courseDatabase);
        for (Course course : courseListing) {
            course.setAvailableSlots(course.getCapacity() - course.getStudents().size());
        }
        return courseListing;
    }

    public static void dropCourse(Student student, Course course) {
        course.removeStudent(student);
        student.dropCourse(course);
    }
}