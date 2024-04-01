package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Антон", "Антонов", "Антонович","прораб", "anton.antonov.1991@gmail.com", 60000, "+78083455678", 37);
        employee.printInfo();
        System.out.println(employee);

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Андрей", "Андреев", "Андреевич","прораб", "anton.antonov.1991@gmail.com", 60000, "+78083455678", 32);
        employees[1] = new Employee("Павел", "Павлов", "Павлович","прораб", "anton.antonov.1992@gmail.com", 70000, "+78083455678", 37);
        employees[2] = new Employee("Иван", "Иванов", "Иванович","прораб", "anton.antonov.1993@gmail.com", 60000, "+78083455678", 33);
        employees[3] = new Employee("Роман", "Романов", "Романович","прораб", "anton.antonov.1994@gmail.com", 70000, "+78083455678", 38);
        employees[4] = new Employee("Антон", "Антонов", "Антонович","прораб", "anton.antonov.1995@gmail.com", 65000, "+78083455678", 35);
        for(Employee employee1: employees) {
            System.out.println(employee1);
        }

        Park.Attractions attractions = new Park.Attractions("Карусель", "10 минут", 5.0);
        System.out.println(attractions);
    }
}
