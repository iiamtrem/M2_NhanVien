class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String employeeId, String fullName, String email, double basicSalary, double bonus) {
        super(employeeId, fullName, email, basicSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.basicSalary + this.bonus;
    }

    @Override
    public String getEmployeeType() {
        return "Nhân viên chính thức";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phụ cấp: " + String.format("%,.0f", bonus) + " VND");
        System.out.println("Lương thực nhận: " + String.format("%,.0f", calculateSalary()) + " VND");
        System.out.println("Loại nhân viên: " + getEmployeeType());
    }
}