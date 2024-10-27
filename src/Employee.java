import java.util.Objects;

class Employee {

    private static int counter = 0;

    private String name;
    private int department;
    private double salary;
    private int id;

    Employee(String name, int department, int salary) {
        if (department < 1 || department > 6) {
            System.out.println("Такого отдела несуществует");
        } else {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.id = ++counter;
        }
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 6) {
            System.out.println("Такого отдела несуществует");
        } else {
            this.department = department;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee2 = (Employee) other;
        return (name.equals(employee2.name) && department == employee2.department && salary == employee2.salary && id == employee2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ФИО: " + name + ", отдел: " + department + ", зарплата: " + salary;
    }

}
