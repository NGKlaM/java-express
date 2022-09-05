package BaiTap;

import org.w3c.dom.CDATASection;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
public class TheMuon extends SinhVien{
    private int sPMuon;
    private Date ngayMuon;
    private Date ngayTra;
    private String soHieuSach;
    private SinhVien sv;
    public TheMuon()
    {

    }
    public TheMuon(int sPMuon,Date ngayMuon,Date ngayTra,String soHieuSach,SinhVien sv)
    {
        this.sPMuon=sPMuon;
        this.ngayMuon=ngayMuon;
        this.ngayTra=ngayTra;
        this.soHieuSach=soHieuSach;
        this.sv=sv;
    }

    public void nhapThongTin() throws Exception
    {
        this.sv=new SinhVien();
        this.sv.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phieu muon:");
        this.sPMuon=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        this.soHieuSach=sc.nextLine();
        this.ngayMuon=new Date();
        System.out.print("Nhap ngay tra:(dd--mm--yy): ");
        String ngt=sc.nextLine();
        DateFormat df=new SimpleDateFormat("dd-MM-yy");
        this.ngayTra=df.parse(ngt);
    }
    public int getNgayTra()
    {
        return this.ngayTra.getDate();
    }
    public void hienThongTin()
    {
        sv.hienThongTin();
        System.out.println("Ten sach tra: "+this.soHieuSach);
    }

    public static void main(String[] args) throws Exception
    {
        ArrayList ds=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int dem=0;
        char c;
        do
        {
            System.out.println("Nhap thong tin the muon thu "+(dem+1)+" :");
            TheMuon tg=new TheMuon();
            tg.nhapThongTin();
            ds.add(tg);
            dem++;
            System.out.print("Co muon nhap nua khong (Y/N): ");
            c=sc.nextLine().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("=============================================");
        for(int i=0;i < ds.size();i++)
            if(ds.get(i).getNgayTra()==30)
                ds.get(i).toString();
    }

}
