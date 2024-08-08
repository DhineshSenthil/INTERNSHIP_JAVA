package student;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
class Student {
	    private String id;
	    private String name;
	    private int age;
	    private String email;

	    public Student(String id, String name, int age, String email) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.email = email;
	    }

	    // Getters and Setters
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", email='" + email + '\'' +
	                '}';
	    }
	}

	class Course {
	    private String code;
	    private String title;
	    private int credits;

	    public Course(String code, String title, int credits) {
	        this.code = code;
	        this.title = title;
	        this.credits = credits;
	    }

	    // Getters and Setters
	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public int getCredits() {
	        return credits;
	    }

	    public void setCredits(int credits) {
	        this.credits = credits;
	    }

	    @Override
	    public String toString() {
	        return "Course{" +
	                "code='" + code + '\'' +
	                ", title='" + title + '\'' +
	                ", credits=" + credits +
	                '}';
	    }
	}

	public class studentinfo {
	    private List<Student> students;
	    private List<Course> courses;

	    public studentinfo() {
	        students = new ArrayList<>();
	        courses = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public Student findStudentById(String id) {
	        for (Student student : students) {
	            if (student.getId().equals(id)) {
	                return student;
	            }
	        }
	        return null;
	    }

	    public Course findCourseByCode(String code) {
	        for (Course course : courses) {
	            if (course.getCode().equals(code)) {
	                return course;
	            }
	        }
	        return null;
	    }

	    public void listStudents() {
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }

	    public void listCourses() {
	        for (Course course : courses) {
	            System.out.println(course);
	        }
	    }

	    public static void main(String[] args) {
	        studentinfo sms = new studentinfo();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Add Student");
	            System.out.println("2. Add Course");
	            System.out.println("3. List Students");
	            System.out.println("4. List Courses");
	            System.out.println("5. Find Student by ID");
	            System.out.println("6. Find Course by Code");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student ID: ");
	                    String id = scanner.nextLine();
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    System.out.print("Enter student email: ");
	                    String email = scanner.nextLine();
	                    sms.addStudent(new Student(id, name, age, email));
	                    break;
	                case 2:
	                    System.out.print("Enter course code: ");
	                    String code = scanner.nextLine();
	                    System.out.print("Enter course title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter course credits: ");
	                    int credits = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    sms.addCourse(new Course(code, title, credits));
	                    break;
	                case 3:
	                    sms.listStudents();
	                    break;
	                case 4:
	                    sms.listCourses();
	                    break;
	                case 5:
	                    System.out.print("Enter student ID: ");
	                    String studentId = scanner.nextLine();
	                    Student student = sms.findStudentById(studentId);
	                    if (student != null) {
	                        System.out.println(student);
	                    } else {
	                        System.out.println("Student not found.");
	                    }
	                    break;
	                case 6:
	                    System.out.print("Enter course code: ");
	                    String courseCode = scanner.nextLine();
	                    Course course = sms.findCourseByCode(courseCode);
	                    if (course != null) {
	                        System.out.println(course);
	                    } else {
	                        System.out.println("Course not found.");
	                    }
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
