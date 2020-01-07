package Test;

import java.util.Arrays;

public class WorkingPlace   {

    private Departments departments;
    private Employee[] employees;
    private Boss boss;

    public WorkingPlace(Departments departments, Boss boss, Employee[] employees) {
        this.departments = departments;
        this.boss = boss;
        this.employees= employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "WorkingPlace{" +
                "departments=" + departments +
                ", employees=" + Arrays.toString(employees) +
                ", boss=" + boss +
                '}';
    }


}
