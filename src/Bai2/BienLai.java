package Bai2;
import java.util.Scanner;
public class BienLai {
    private KhachHang kh;
    private int chiSoCu;
    private int chiSoMoi;
    private double tienTra;
    public BienLai()
    {

    }
    public BienLai(KhachHang kh,int chiSoCu,int chiSoMoi,double tienTra)
    {
        this.kh=kh;
        this.chiSoCu=chiSoCu;
        this.chiSoMoi=chiSoMoi;
        this.tienTra=tienTra;
    }
    //---------------------
    public void nhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        this.kh=new KhachHang();
        this.kh.nhapThongTin();
        System.out.print("Nhap chi so cu:");
        this.chiSoCu=sc.nextInt();
        System.out.print("Nhap chi so moi:");
        this.chiSoMoi=sc.nextInt();
        this.tienTra= (double)(this.chiSoMoi-this.chiSoCu)*750;
    }
    //--------------------
    public void hienThongTin()
    {
        this.kh.hienThongTin();
        System.out.println("Chi so cu: "+this.chiSoCu);
        System.out.println("Chi so moi: "+this.chiSoMoi);
        System.out.println("So tien phai tra: "+this.tienTra);
    }
}
