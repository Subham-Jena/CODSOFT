
public class Main {
	public static void main(String[] args) {
	    Database.initialize();

	    Course CS101 = new Course("CS101", "Introduction to Computer Science",
	            "An introduction to the field of computer science.", 30, 101);
	    Course DSA102 = new Course("DSA102", "Data Structures and Algorithms",
	            "An in-depth look at data structures and algorithms.", 25, 102);
	    Database.addCourse(CS101);
	    Database.addCourse(DSA102);

	   
	    Student john = new Student("001", "John Smith");
	    Student jane = new Student("002", "Jane Doe");
	    Database.addStudent(john);
	    Database.addStudent(jane);

	    // register students for courses
	    john.registerCourse(CS101);
	    jane.registerCourse(DSA102);

	    // print out the course listing
	    System.out.println("Course Listing:");
	    for (Course course : Database.getCourseListing()) {
	        System.out.println(course.getCode() + ": " + course.getTitle());
	    }

	    // print out the registered courses for each student
	    System.out.println("\nRegistered Courses:");
	    System.out.println("John: " + john.getCourses());
	    System.out.println("Jane: " + jane.getCourses());

	    // drop a course for a student
	    Database.dropCourse(john, CS101);

	    // print out the registered courses for each student(again)
	    System.out.println("\nRegistered Courses (after dropping John from CSC101):");
	    System.out.println("John: " + john.getCourses());
	    System.out.println("Jane: " + jane.getCourses());

	    // print out the available slots for each course
	    System.out.println("\nAvailable Slots:");
	    for (Course course : Database.getCourseDatabase()) {
	        System.out.println(course.getCode() + ": " + course.getAvailableSlots());
	    }
	}}