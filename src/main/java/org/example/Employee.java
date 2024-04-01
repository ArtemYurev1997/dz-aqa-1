package org.example;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String post;
    private String email;
    private int salary;
    private String telephone;
    private int age;

    public Employee(String name, String surname, String patronymic, String post, String email, int salary, String telephone, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.salary = salary;
        this.telephone = telephone;
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void printInfo() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                '}');
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                '}';
    }
}
