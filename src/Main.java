public class Main {
    public static void main(String[] args) {
        CompanyManagementSystem cms = new CompanyManagementSystem();

        // 1. Thêm mới nhân viên
        System.out.println("--- Thêm nhân viên ---");
        Employee emp1 = new FullTimeEmployee("FT001", "Nguyễn Văn A", "a.nguyen@email.com", 50000000, 5000000);
        Employee emp2 = new InternEmployee("ITN001", "Trần Thị B", "b.tran@email.com", 10000000, "Nguyễn Văn A");
        Employee emp3 = new ContractorEmployee("CTR001", "Lê Văn C", "c.le@email.com", 160, 250000);
        Employee emp4 = new FullTimeEmployee("FT002", "Phạm Thị D", "d.pham@email.com", 60000000, 7500000);

        cms.addEmployee(emp1);
        cms.addEmployee(emp2);
        cms.addEmployee(emp3);
        cms.addEmployee(emp4);
        cms.addEmployee(new InternEmployee("ITN002", "Hoàng Văn E", "e.hoang@email.com", 8000000, "Phạm Thị D"));

        System.out.println("\n--- Thêm nhân viên trùng lặp ---");
        cms.addEmployee(new FullTimeEmployee("FT001", "Người X", "x.nguoi@email.com", 50000000, 5000000)); // Thử thêm trùng ID


        // 2. Hiển thị thông tin nhân viên và lương (trong phần báo cáo tổng hợp)

        // 3. Thêm mới dự án
        System.out.println("\n--- Thêm dự án ---");
        Project project1 = new Project("PJ001", "Hệ thống ERP");
        Project project2 = new Project("PJ002", "Ứng dụng Mobile Banking");
        cms.addProject(project1);
        cms.addProject(project2);

        // 4. Giao nhân viên vào dự án
        System.out.println("\n--- Gán nhân viên vào dự án ---");
        cms.assignEmployeeToProject("FT001", "PJ001");
        cms.assignEmployeeToProject("ITN001", "PJ001");
        cms.assignEmployeeToProject("CTR001", "PJ002");
        cms.assignEmployeeToProject("FT002", "PJ002");
        cms.assignEmployeeToProject("FT001", "PJ002");

        System.out.println("\n--- Gán nhân viên không tồn tại hoặc vào dự án không tồn tại ---");
        cms.assignEmployeeToProject("XYZ001", "PJ001");
        cms.assignEmployeeToProject("FT001", "PJ999");


        // 5. Báo cáo tổng hợp
        // 5.1 Hiển thị danh sách tất cả nhân viên kèm loại, thông tin liên quan, và lương thực nhận.
        cms.displayAllEmployeesInfo();

        // 5.2 Hiển thị danh sách dự án và các thành viên đang tham gia.
        cms.displayAllProjectsAndMembers();

        System.out.println("\n--- Thông tin chi tiết của một nhân viên (FT001) ---");
        Employee foundEmp = cms.findEmployeeById("FT001");
        if (foundEmp != null) {
            foundEmp.displayInfo(); // Tính đa hình
            System.out.println("Lương thực nhận: " + String.format("%,.0f", foundEmp.calculateSalary()) + " VND");
        } else {
            System.out.println("Không tìm thấy nhân viên FT001");
        }

        System.out.println("\n--- Thông tin chi tiết của một nhân viên (CTR001) ---");
        Employee foundContractor = cms.findEmployeeById("CTR001");
        if (foundContractor != null) {
            foundContractor.displayInfo();
        } else {
            System.out.println("Không tìm thấy nhân viên CTR001");
        }
    }
}