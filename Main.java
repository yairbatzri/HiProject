package Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee a = new Employee("Yair", 31);
        Employee b = new Employee("Ron", 25);
        Employee c = new Employee("Avner", 47);
        Employee d = new Employee("Moshe", 18);
        Employee e = new Employee("Yoni", 23);
        Employee f = new Employee("Omer", 24);
        Employee g = new Employee("Dor", 26);
        Employee h = new Employee("Eyal", 45);
        Employee i = new Employee("Ronit", 65);
        Employee j = new Employee("Nili", 34);
        Employee k = new Employee("Zohar", 27);
        Employee m = new Employee("Maya", 22);

        Boss w = new Boss("Gadi", 42);
        Boss x = new Boss("Kineret", 50);
        Boss y = new Boss("Shirly", 41);
        Boss z = new Boss("Barak", 41);

        Employee[] devEmp = {a, b, c};
        Employee[] qaEmp = {d, e, f};
        Employee[] hrEmp = {g, h, i};
        Employee[] graphicsEmp = {j, k, m};

        WorkingPlace devCrew = new WorkingPlace(Departments.DEV, w, devEmp);
        WorkingPlace qaCrew = new WorkingPlace(Departments.QA, x, qaEmp);
        WorkingPlace hrCrew = new WorkingPlace(Departments.HR, y, hrEmp);
        WorkingPlace graphicsCrew = new WorkingPlace(Departments.GRAPHICS, z, graphicsEmp);

        Employee[][] allEmployees = {devEmp,qaEmp,hrEmp,graphicsEmp};
        Boss[] allBosses = {w, x, y, z};


        System.out.println("-----------------Development:Boss: 32-35k, Employee: 14-18k-----------------");
        System.out.println("Boss:");
        initBoss(w,Departments.DEV);
        System.out.println("Employees:");
        initEmployee(devEmp,Departments.DEV);

        System.out.println("-----------------QA:Boss: 14-18k, Employee: 8-12k-----------------");
        System.out.println("Boss:");
        initBoss(x,Departments.QA);
        System.out.println("Employees:");
        initEmployee(qaEmp,Departments.QA);

        System.out.println("-----------------HR:Boss: 15-16k, Employee: 10-12k-----------------");
        System.out.println("Boss:");
        initBoss(y,Departments.HR);
        System.out.println("Employees:");
        initEmployee(hrEmp,Departments.HR);

        System.out.println("-----------------Graphics:Boss: 15-16k, Employee: 10-12k-----------------");
        System.out.println("Boss:");
        initBoss(z,Departments.GRAPHICS);
        System.out.println("Employees:");
        initEmployee(graphicsEmp,Departments.GRAPHICS);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    public static int salaryRange (Departments departments, PersonType type){

        switch (type){
            case EMPLOYEE:
                return employeeSalaryRange(departments);
            case BOSS:
                return bossSalaryRange(departments);
        }

        return 0;
    }

    public static int bossSalaryRange(Departments departmentse) {

        switch (departmentse) {
            case DEV:
                return (int) (Math.random() * 32000) + 3000;
            case HR:
                return (int) (Math.random() * 15000) + 1000;
            case QA:
                return (int) (Math.random() * 14000) + 4000;
            default:
                return (int) (Math.random() * 18000) + 2000;
        }
    }



    public static int employeeSalaryRange(Departments departments){

        switch (departments){
            case DEV:
                return (int) (Math.random() * 14000) + 4000;
            case HR:
                return (int) (Math.random() * 10000) + 2000;
            case QA:
                return (int) (Math.random() * 8000) + 4000;
            default:
                return (int) (Math.random() * 14000) + 2000;
        }
    }

    public static void initEmployee (Employee [] one, Departments departments) {
        int salary2 = salaryRange(departments, PersonType.EMPLOYEE);

        for (int i = 0; i < one.length; i++) {
            Salary salary = one[i].getSalary();
            int[] salaries = salary.getSalaries();

            for (int j = 0; j < salaries.length; j++) {
                salaries[j] = (int) (Math.random() * 3000) + 13000;

            }
        }
        for (Person workers : one) {
            System.out.println(workers.getName() + " " + Arrays.toString(workers.getSalary().getSalaries()));
        }
    }
    public static void initBoss (Person d, Departments departments){
        int salary2 = salaryRange(departments, PersonType.BOSS);


        int[] bossSalary = d.getSalary().getSalaries();
        for (int i = 0; i < bossSalary.length; i++) {
            bossSalary[i] = (int) (Math.random() * 32000) + 4000;
        }
        System.out.println(d.getName() + " " + Arrays.toString(bossSalary)) ;
    }
}

