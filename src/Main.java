import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi thứ nhất:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai:");
        String str2 = sc.nextLine();
        ktrachuoi ktc = new ktrachuoi();
        ktc.chuoichuachuoi(str1, str2);

        System.out.println("Nhập chuỗi ký tự lặp: ");
        Scanner sc2 = new Scanner(System.in);
        String str3 = sc2.nextLine();
        ktkytu kt = new ktkytu();
        kt.loaikytu(str3);

    }
}
