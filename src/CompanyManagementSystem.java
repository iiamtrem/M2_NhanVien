class CompanyManagementSystem {
    private Employee[] employees;
    private Project[] projects;
    private int employeeCount;
    private int projectCount;
    private static final int MAX_EMPLOYEES = 50;
    private static final int MAX_PROJECTS = 10;

    public CompanyManagementSystem() {
        this.employees = new Employee[MAX_EMPLOYEES];
        this.projects = new Project[MAX_PROJECTS];
        this.employeeCount = 0;
        this.projectCount = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("Lỗi: Không thể thêm nhân viên null.");
            return false;
        }
        // Kiểm tra trùng mã nhân viên
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId().equals(employee.getEmployeeId())) {
                System.out.println("Lỗi: Mã nhân viên " + employee.getEmployeeId() + " đã tồn tại.");
                return false;
            }
        }

        if (employeeCount < MAX_EMPLOYEES) {
            employees[employeeCount] = employee;
            employeeCount++;
            System.out.println("Đã thêm nhân viên: " + employee.getFullName());
            return true;
        } else {
            System.out.println("Công ty đã đạt số lượng nhân viên tối đa.");
            return false;
        }
    }

    public boolean addProject(Project project) {
        if (project == null) {
            System.out.println("Lỗi: Không thể thêm dự án null.");
            return false;
        }
        // Kiểm tra trùng mã dự án
        for (int i = 0; i < projectCount; i++) {
            if (projects[i].getProjectId().equals(project.getProjectId())) {
                System.out.println("Lỗi: Mã dự án " + project.getProjectId() + " đã tồn tại.");
                return false;
            }
        }

        if (projectCount < MAX_PROJECTS) {
            projects[projectCount] = project;
            projectCount++;
            System.out.println("Đã thêm dự án: " + project.getProjectName());
            return true;
        } else {
            System.out.println("Công ty đã đạt số lượng dự án tối đa.");
            return false;
        }
    }

    public Employee findEmployeeById(String employeeId) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public Project findProjectById(String projectId) {
        for (int i = 0; i < projectCount; i++) {
            if (projects[i].getProjectId().equals(projectId)) {
                return projects[i];
            }
        }
        return null;
    }

    public boolean assignEmployeeToProject(String employeeId, String projectId) {
        Employee employee = findEmployeeById(employeeId);
        Project project = findProjectById(projectId);

        if (employee == null) {
            System.out.println("Không tìm thấy nhân viên với ID: " + employeeId);
            return false;
        }
        if (project == null) {
            System.out.println("Không tìm thấy dự án với ID: " + projectId);
            return false;
        }

        return project.assignEmployee(employee);
    }

    public void displayAllEmployeesInfo() {
        System.out.println("\n========== DANH SÁCH TẤT CẢ NHÂN VIÊN ==========");
        if (employeeCount == 0) {
            System.out.println("Chưa có nhân viên nào trong hệ thống.");
            return;
        }
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("------------------------------------");
            employees[i].displayInfo(); // Tính đa hình được áp dụng ở đây
        }
        System.out.println("================================================");
    }

    public void displayAllProjectsAndMembers() {
        System.out.println("\n========== DANH SÁCH DỰ ÁN VÀ THÀNH VIÊN ==========");
        if (projectCount == 0) {
            System.out.println("Chưa có dự án nào trong hệ thống.");
            return;
        }
        for (int i = 0; i < projectCount; i++) {
            projects[i].displayProjectInfo();
            System.out.println("------------------------------------");
        }
        System.out.println("==================================================");
    }
}