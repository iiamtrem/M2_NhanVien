abstract class Employee {
    private String employeeId;
    private String fullName;
    private String email;
    protected double basicSalary;

    public Employee(String employeeId, String fullName, String email, double basicSalary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public abstract String getEmployeeType();

    public void displayInfo() {
        System.out.println("Mã NV: " + employeeId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Lương cơ bản: " + String.format("%,.0f", basicSalary) + " VND");
    }
}