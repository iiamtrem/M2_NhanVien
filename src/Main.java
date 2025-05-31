public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[100];
        int soNV = 0;

        DuAn[] duAns = new DuAn[2];

        nhanViens[soNV++] = new NhanVienChinhThuc("NV01", "A", "a@gmail.com", 15000000, 2000000);
        nhanViens[soNV++] = new ThucTapSinh("NV02", "B", "b@gmail.com", 5000000, "A");
        nhanViens[soNV++] = new NhanVienHopDong("NV03", "C", "c@gmail.com", 100, 100000);

        duAns[0] = new DuAn("DA01", "mobile");
        duAns[1] = new DuAn("DA02", "website");

        duAns[0].themNhanVien(nhanViens[0]);
        duAns[0].themNhanVien(nhanViens[1]);
        duAns[1].themNhanVien(nhanViens[2]);

        System.out.println("DANH SÁCH NHÂN VIÊN");
        for (int i = 0; i < soNV; i++) {
            nhanViens[i].hienThiThongTin();
            System.out.println("****************************");
        }

        System.out.println("\nDANH SÁCH DỰ ÁN");
        for (int i = 0; i < duAns.length; i++) {
            duAns[i].hienThiNhanVien();
            System.out.println("****************************");
        }
    }
}
