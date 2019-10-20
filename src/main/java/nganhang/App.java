package nganhang;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();

        XuLyChung kh = new XuLyChung();
        listKH = kh.addKH(listKH);

        kh.hienThi(listKH);
    }
}
