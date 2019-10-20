package nganhang;

public class NHHSBC extends NganHang {
    public NHHSBC(){
        setMaNganHang("NHHSBC");
        setTenNganHang("Ngan Hang HSBC");
        setLaiSuatNganHang(0.5f);
    }

    public double tinhPhi(double soTienCanChuyen){
        double phi = 5000 + getLaiSuatNganHang()*soTienCanChuyen;
        return phi;
    }
}
