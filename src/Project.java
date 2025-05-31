class Project {
    private String projectId;
    private String projectName;
    private Employee[] assignedEmployees;
    private int currentEmployeeCount;
    private static final int MAX_EMPLOYEES_PER_PROJECT = 10;

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.assignedEmployees = new Employee[MAX_EMPLOYEES_PER_PROJECT];
        this.currentEmployeeCount = 0;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public boolean assignEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("Lỗi: Không thể gán nhân viên null vào dự án.");
            return false;
        }
        // Kiểm tra xem nhân viên đã có trong dự án chưa
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (assignedEmployees[i].getEmployeeId().equals(employee.getEmployeeId())) {
                System.out.println("Nhân viên " + employee.getFullName() + " đã có trong dự án " + this.projectName);
                return false;
            }
        }
        // Kiểm tra giới hạn
        if (currentEmployeeCount < MAX_EMPLOYEES_PER_PROJECT) {
            assignedEmployees[currentEmployeeCount] = employee;
            currentEmployeeCount++;
            System.out.println("Đã gán nhân viên " + employee.getFullName() + " vào dự án " + this.projectName);
            return true;
        } else {
            System.out.println("Dự án " + this.projectName + " đã đủ số lượng nhân viên tối đa.");
            return false;
        }
    }

    public void displayProjectInfo() {
        System.out.println("--- Thông tin dự án ---");
        System.out.println("Mã dự án: " + projectId);
        System.out.println("Tên dự án: " + projectName);
        System.out.println("Danh sách nhân viên tham gia (" + currentEmployeeCount + "):");
        if (currentEmployeeCount == 0) {
            System.out.println(" (Chưa có nhân viên nào)");
        } else {
            for (int i = 0; i < currentEmployeeCount; i++) {
                System.out.println("  - " + assignedEmployees[i].getFullName() + " (ID: " + assignedEmployees[i].getEmployeeId() + ")");
            }
        }
    }
    public int getCurrentEmployeeCount() {
        return currentEmployeeCount;
    }

    public Employee[] getAssignedEmployees() {
        // Trả về một bản sao để đảm bảo tính bao đóng (optional, nhưng tốt hơn)
        Employee[] copy = new Employee[currentEmployeeCount];
        System.arraycopy(assignedEmployees, 0, copy, 0, currentEmployeeCount);
        return copy;
    }
}