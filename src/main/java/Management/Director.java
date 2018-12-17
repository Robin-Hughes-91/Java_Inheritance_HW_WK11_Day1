package Management;


public class Director extends Manager{
    private Double budget;

    public Director(String name, int nationalInsuranceNumber, Double salary, String deptName, Double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;

    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public Double payBonus() {
        return salary * 0.02;
    }
}
