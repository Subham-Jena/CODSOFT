import java.util.ArrayList;

public class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private int schedule;
    private ArrayList<Student> students;

    public Course(String code, String title, String description, int capacity, int schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.students = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSchedule() {
        return schedule;
    }

    public int getAvailableSlots() {
        return capacity - students.size();
    }

    public void registerStudent(Student student) {
        students.add(student);
    }
    
    public void setAvailableSlots(int numSlots) {
        this.capacity = numSlots + students.size();
    }


    public void removeStudent(Student student) {
        students.remove(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}