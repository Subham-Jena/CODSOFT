import java.util.*;

public class Student {
    private String id;
    private String name;
    private ArrayList<Course> courses;
    
public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void registerCourse(Course course) {
        course.registerStudent(this);
        courses.add(course);
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
        courses.remove(course);
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
}