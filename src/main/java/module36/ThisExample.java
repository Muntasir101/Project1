package module36;

public class ThisExample{
    public static void main(String[] args) {
        Student student1 = new Student ("Smith", "computer science");
        student1.introduce();

        Student student2 = new Student ("Bill", "mathematics");
        student2.introduce();

        Teacher teacher1 = new Teacher ("John", "john@gmail.com");
        Teacher teacher2 = new Teacher ("Sam", "silly@gmail.com");
        teacher1.introduce();
        teacher2.introduce();

    }

}

class Student{

    String name; //instance variable
    String department; //instance variable

    Student (String name, String department){
        this.name = name;
        this.department = department;
    }

    void introduce(){
        System.out.println("My name is " + this.name + " and I am in " + this.department);
    }


}

class Teacher{

    String name;
    String email;

    Teacher (String name, String email){
        this.name = name;
        this.email = email;
    }

    void introduce(){
        System.out.println("My name is " + this.name + " and my email is " + this.email);
    }
}




