package module36;

public class ThisExample {
    public static void main(String[] args) {
        Student student1 = new Student("Smith", "Computer Science");
        student1.introduce();

        Student student2 = new Student("Green", "Math");
        student2.introduce();

        Teacher teacher1 = new Teacher("John", "john@mail.com");
        teacher1.introduce();

        Teacher teacher2 = new Teacher("David", "david@mail.com");
        teacher2.introduce();
    }
}

class Student {
    String name; // Instance variable
    String department; // Instance variable

    Student(String name, String department) { // Constructor
        this.name = name;
        this.department = department;
    }

    void introduce() { // Method
        System.out.println("Hello,I am Student, my name is " + this.name + " My department is " + this.department);
    }
}

class Teacher {
    String name; // Instance variable
    String email; // Instance variable

    Teacher(String name, String email) { // Constructor
        this.name = name;
        this.email = email;
    }

    void introduce() { // Method
        System.out.println("Hello, I am Teacher, my name is " + this.name + " My Email is " + this.email);
    }
}