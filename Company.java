package Test;

import java.util.Arrays;

public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
        this.workingPlaces = new WorkingPlace[Departments.values().length];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkingPlace[] getWorkingPlaces() {
        return workingPlaces;
    }

    public void setWorkingPlaces(WorkingPlace[] workingPlaces) {
        this.workingPlaces = workingPlaces;
    }

    private WorkingPlace [] workingPlaces;


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", workingPlaces=" + Arrays.toString(workingPlaces) +
                '}';
    }
}


