public class NhanVienChinhThuc extends NhanVien {
    private double phuCap;

    public NhanVienChinhThuc(String maNV, String hoTen, String email, double luongCoBan, double phuCap) {
        super(maNV, hoTen, email, luongCoBan);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuongThucNhan() {
        return luongCoBan + phuCap;
    }

    @Override
    public String loaiNhanVien() {
        return "Chính thức";
    }

    public double getPhuCap() {
        return phuCap;
    }
}
