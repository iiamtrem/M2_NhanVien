public class DuAn {
    private String maDuAn;
    private String tenDuAn;
    private NhanVien[] nhanViens = new NhanVien[100];
    private int soNhanVien = 0;

    public DuAn(String maDuAn, String tenDuAn) {
        this.maDuAn = maDuAn;
        this.tenDuAn = tenDuAn;
    }

    public void themNhanVien(NhanVien nv) {
        if (soNhanVien < 100) {
            nhanViens[soNhanVien] = nv;
            soNhanVien++;
        }
    }

    public void hienThiNhanVien() {
        System.out.println("Dự án: " + tenDuAn + " (Mã: " + maDuAn + ")");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("- " + nhanViens[i].getHoTen() + " (" + nhanViens[i].loaiNhanVien() + ")");
        }
    }

    public String getTenDuAn() {
        return tenDuAn;
    }
}
