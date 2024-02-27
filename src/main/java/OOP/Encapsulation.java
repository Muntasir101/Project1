package OOP;

public class Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(20);
        person1.setPhoneNumber(123456);

        System.out.println("Person1 Name: " + person1.getName());
        System.out.println("Person1 Age: " + person1.getAge());
        System.out.println("Person1 Phone Number: " + person1.getPhoneNumber());

        Animal tiger = new Animal();
        tiger.setName("Royal Bengal");
        tiger.setAge(10);

        System.out.println("Animal1 Name: " + tiger.getName());
        System.out.println("Animal1 Age: " + tiger.getAge());

    }
}

class Person{
    private String name;
    private int age;

    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 0 && age<=100){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}

class Animal{
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
