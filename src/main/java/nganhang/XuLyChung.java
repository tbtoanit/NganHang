package nganhang;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLyChung implements IXuLyChung {
    public ArrayList<KhachHang> addKH(ArrayList<KhachHang> listKH){
        while(true){
            KhachHang kh = new KhachHang();
            System.out.println("Nhap 1 de them khach hang 2 de thoat");
            Scanner sc =new Scanner(System.in);
            String a =sc.nextLine();
            if (a.equals("1")) {
                System.out.println("Moi ban nhap vao ma cua khach hang");
                kh.setMaKhachHang(sc.nextLine());
                System.out.println("Moi ban nhap vao ten cua khach hang");
                kh.setTenKhahHang((sc.nextLine()));
                System.out.println("Moi ban nhap vao cap do cua khach hang");
                kh.setCapDoKhachHang(sc.nextLine());
                System.out.println("Moi ban nhap vao so du trong ta khoan cua khach hang");
                kh.setSoDu(sc.nextLine());
                listKH.add(kh);
            }else if(a.equals("2"))break;
        }
        return listKH;
    }
    public void hienThi(ArrayList<KhachHang> listKH){
        for (KhachHang kh:listKH) {
            System.out.println(kh.toString());
        }
    }



}
