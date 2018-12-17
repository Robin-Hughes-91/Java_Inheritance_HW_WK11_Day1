package Staff;


public abstract class Employee {
    public String name;
    public int nationalInsuranceNo;
    public Double salary;

    public Employee(String name, int nationalInsuranceNo, Double salary){
        this.name = name;
        this.nationalInsuranceNo = nationalInsuranceNo;
        this.salary = salary;
    }

//GETTERS//////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public int getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public double getSalary() {
        return salary;
    }


    //SETTERS//////////////////////////////////////////////////////////////////

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }


    //METHODS//////////////////////////////////////////////////////////////////

    public String introduceYourself(){
        return "Hi i am " + getName();
    }

    public void raiseSalary(Double salaryOfEmployee){
        if (salaryOfEmployee > 0 ){
            this.salary += (salaryOfEmployee * 0.1);

        }
    }

    public Double payBonus(){
        return salary * 0.01;
    }



}

