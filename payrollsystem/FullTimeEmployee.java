//author:     Venkata Sai Bhargava Kishan Imandi (25065638)

package payrollsystem;
public class FullTimeEmployee extends Employee {
    // 1. Three Attributes
    private double monthlySalary;
    private double bonus;
    private double taxRate;

    // 2. Constructor
    public FullTimeEmployee(String name, int id, String jobTitle, double monthlySalary, double bonus) {
        super(name, id, jobTitle);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.taxRate = 0.05; // Default 5% tax
    }

    // 3. Method 1 (Overridden)
    @Override
    public double calculateSalary() {
        return (monthlySalary + bonus) * (1 - taxRate);
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + 
               "\n   [Type: Full-Time]" +
               "\n   Base Salary: RM " + monthlySalary + 
               "\n   Bonus: RM " + bonus + 
               "\n   Tax Rate: " + (taxRate * 100) + "%";
    }
    
    // 4. Method 2 Set Bonus
    public void setBonus(double newBonus) {
        this.bonus = newBonus;
    }
}
