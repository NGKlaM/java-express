package Bai2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException ;
public class Chay {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        try
        {
            System.out.println("Ban muon nhap bao nhieu ho gia dinh : ");
            n=sc.nextInt();
        }catch(InputMismatchException e) //su ly ngoai le khi n khong phai la so
        {
            n=0;
        }

        ArrayList ds=new ArrayList(100);
        for(int i=0;i < n;i++)
        {
            BienLai b=new BienLai();
            b.nhapThongTin();
            ds.add(b);
        }
        for(int i=0;i < n;i++)
        {
            System.out.println("Ho gia dinh thu : "+(i+1));
            ds.get(i).notifyAll();
            System.out.println("====================");
        }
    }
}
