package p2;
import java.util.Scanner;
public class Employee {
    int id;
    String name;
    int salary;
    String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        Scanner hh=new Scanner(System.in);
        System.out.println("enter id");
        int num1= hh.nextInt();
        obj.setId(num1);
        System.out.println("name");
        String na=hh.nextLine();
        obj.setName(na);
        System.out.println("department");
        String naa=hh.nextLine();
        obj.setDepartment(naa);
        System.out.println("salary");
        int naaa=hh.nextInt();
        obj.setSalary(naaa);
        System.out.println(obj.getId());
        System.out.println(obj.getDepartment());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}

