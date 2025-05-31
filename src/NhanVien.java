public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private String email;
    protected double luongCoBan;

    public NhanVien(String maNV, String hoTen, String email, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getEmail() {
        return email;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public abstract double tinhLuongThucNhan();

    public abstract String loaiNhanVien();

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Loại nhân viên: " + loaiNhanVien());
        System.out.println("Lương thực nhận: " + tinhLuongThucNhan());
    }
}
