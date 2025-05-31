public class ThucTapSinh extends NhanVien {
    private String nguoiHuongDan;

    public ThucTapSinh(String maNV, String hoTen, String email, double luongCoBan, String nguoiHuongDan) {
        super(maNV, hoTen, email, luongCoBan);
        this.nguoiHuongDan = nguoiHuongDan;
    }

    @Override
    public double tinhLuongThucNhan() {
        return luongCoBan;
    }

    @Override
    public String loaiNhanVien() {
        return "Thực tập sinh";
    }

    public String getNguoiHuongDan() {
        return nguoiHuongDan;
    }
}
