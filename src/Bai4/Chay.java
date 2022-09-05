package Bai4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chay {
    static List<SoPhuc> listSoPhuc = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Nhập 2 số phúc");
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số phức được cấu tạo từ phần thực và phần ảo");
            System.out.println("Mời bạn nhập phần thực : ");
            double phanThuc = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập phần ảo : ");
            double phanAo = Double.parseDouble(scanner.nextLine());
            SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
            System.out.println("Số phức được tạo là: " + taoSoPhuc(soPhuc));
            addSoPhuc(soPhuc);
        }
        inSoPhuc();
        congSoPhuc();
        nhanSoPhuc();
    }

    public static void addSoPhuc(SoPhuc soPhuc){
        listSoPhuc.add(soPhuc);
    }

    public static void congSoPhuc(){
        System.out.println("Cộng 2 số phức : ");
        double phanThuc = 0;
        double phanAo = 0;
        for (SoPhuc soPhuc : listSoPhuc){
            phanThuc = phanThuc + soPhuc.getPhanThuc();
            phanAo = phanAo + soPhuc.getPhanAo();
        }

        SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
        System.out.println("Kết quả tổng 2 số phức là: " + taoSoPhuc(soPhuc));
    }

    public static void nhanSoPhuc(){
        System.out.println("Nhân 2 số phức : ");
        double phanThuc = 0;
        double phanAo = 0;
        for (SoPhuc soPhuc : listSoPhuc){
            phanThuc = phanThuc * soPhuc.getPhanThuc();
            phanAo = phanAo * soPhuc.getPhanAo();
        }

        SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
        System.out.println("Kết quả nhân 2 số phức là: " + taoSoPhuc(soPhuc));
    }

    public static void inSoPhuc(){
        for (SoPhuc sophuc : listSoPhuc){
            System.out.println("Số phúc là: " + taoSoPhuc(sophuc));
        }
    }

    public static String taoSoPhuc(SoPhuc soPhuc) {
        String so = soPhuc.getPhanThuc() + " + " + soPhuc.getPhanAo() + "*i";
        return so;
    }

}
