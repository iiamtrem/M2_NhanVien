class InternEmployee extends Employee {
    private String mentorName;

    public InternEmployee(String employeeId, String fullName, String email, double basicSalary, String mentorName) {
        super(employeeId, fullName, email, basicSalary);
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public double calculateSalary() {
        return this.basicSalary;
    }

    @Override
    public String getEmployeeType() {
        return "Thực tập sinh";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Người hướng dẫn: " + mentorName);
        System.out.println("Lương thực nhận: " + String.format("%,.0f", calculateSalary()) + " VND");
        System.out.println("Loại nhân viên: " + getEmployeeType());
    }
}