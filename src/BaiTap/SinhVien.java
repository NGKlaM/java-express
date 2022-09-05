package BaiTap;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class SinhVien
{
    private String hoTen;
    private String mSV;
    private Date ngaySinh;
    private String lop;

    public SinhVien()
    {

    }
    public SinhVien(String hoTen,String mSV,Date ngaySinh,String lop)
    {
        this.hoTen=hoTen;
        this.mSV=mSV;
        this.ngaySinh=ngaySinh;
        this.lop=lop;
    }
    public void nhapThongTin() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap ma sinh vien :");
        this.mSV=sc.nextLine();
        System.out.print("Nhap ngay sinh(dd--MM-yy):");
        String ns=sc.nextLine();
        DateFormat df=new SimpleDateFormat("dd-mm-yy");
        this.ngaySinh= df.parse(ns);
        System.out.print("Nhap lop: ");
        this.lop=sc.nextLine();
    }
    public void hienThongTin()
    {
        System.out.println("Ho va ten: "+this.hoTen);
        System.out.println("Ma sinh vien: "+this.mSV);
        System.out.println("Ngay sinh: "+this.ngaySinh);
        System.out.println("Lop : "+this.lop);
    }

    public String getHoTen()
    {
        return this.hoTen;
    }
    public String getMSV()
    {
        return this.mSV;
    }
    public Date getNgaySinh()
    {
        return this.ngaySinh;
    }
    public String getLop()
    {
        return this.lop;
    }
}
