class ContractorEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public ContractorEmployee(String employeeId, String fullName, String email, int workingHours, double hourlyRate) {
        super(employeeId, fullName, email, 0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.workingHours * this.hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Nhân viên hợp đồng";
    }

    @Override
    public void displayInfo() {
        System.out.println("Mã NV: " + getEmployeeId());
        System.out.println("Họ tên: " + getFullName());
        System.out.println("Email: " + getEmail());
        // Contractor không hiển thị lương cơ bản, mà hiển thị thông tin riêng
        System.out.println("Số giờ làm việc: " + workingHours);
        System.out.println("Đơn giá mỗi giờ: " + String.format("%,.0f", hourlyRate) + " VND");
        System.out.println("Lương thực nhận: " + String.format("%,.0f", calculateSalary()) + " VND");
        System.out.println("Loại nhân viên: " + getEmployeeType());
    }
}