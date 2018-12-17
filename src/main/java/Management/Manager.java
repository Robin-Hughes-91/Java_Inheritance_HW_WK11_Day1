package Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, int nationalInsuranceNumber, Double salary, String deptName){
        super(name, nationalInsuranceNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
