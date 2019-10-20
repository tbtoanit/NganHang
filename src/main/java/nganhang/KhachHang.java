package nganhang;

public class KhachHang {
    private String maKhachHang;
    private String tenKhahHang;
    private String capDoKhachHang;
    private String soDu;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhahHang() {
        return tenKhahHang;
    }

    public void setTenKhahHang(String tenKhahHang) {
        this.tenKhahHang = tenKhahHang;
    }

    public String getCapDoKhachHang() {
        return capDoKhachHang;
    }

    public void setCapDoKhachHang(String capDoKhachHang) {
        this.capDoKhachHang = capDoKhachHang;
    }

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
        this.soDu = soDu;
    }
    public String toString(){
        return "[Khach Hang]="+
                "[MaKhachHang= "+getMaKhachHang()+
                ", TenKhachHang="+getTenKhahHang()+
                ", CapDoKhachHang="+getCapDoKhachHang()+
                ", SoDu="+getSoDu()+"]";
    }
}
