package OOP;

public class Inheritance {
    public static void main(String[] args) {
        Programmer smith = new Programmer();
        int mainSalary = smith.employeeSalary;
        int programmerBonus = smith.programmerBonus;
        System.out.println("Programmer Main Salary: " + mainSalary);
        System.out.println("Programmer Bonus: " + programmerBonus);
        int totalSalary = mainSalary + programmerBonus;
        System.out.println("Programmer Total Salary: " + totalSalary);

        Manager green = new Manager();
        int mainSalary2 = green.employeeSalary;
        int managerBonus = green.managerBonus;
        System.out.println("Programmer Main Salary: " + mainSalary2);
        System.out.println("Programmer Bonus: " + managerBonus);
        int totalSalary2 = mainSalary2 + managerBonus;
        System.out.println("Programmer Total Salary: " + totalSalary2);

    }
}
class Employee{
    int employeeSalary = 10000;
}

class Programmer extends Employee{
    int programmerBonus = 500;
}

class Manager extends Employee{
    int managerBonus = 1000;
}
