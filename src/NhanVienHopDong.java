public class NhanVienHopDong extends NhanVien {
    private int soGioLam;
    private double donGiaGio;

    public NhanVienHopDong(String maNV, String hoTen, String email, int soGioLam, double donGiaGio) {
        super(maNV, hoTen, email, 0); // Không dùng lương cơ bản
        this.soGioLam = soGioLam;
        this.donGiaGio = donGiaGio;
    }

    @Override
    public double tinhLuongThucNhan() {
        return soGioLam * donGiaGio;
    }

    @Override
    public String loaiNhanVien() {
        return "Hợp đồng";
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public double getDonGiaGio() {
        return donGiaGio;
    }
}
