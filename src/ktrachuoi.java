public class ktrachuoi {
    void chuoichuachuoi(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("Chuỗi '" + str1 + "' chứa chuỗi: '" + str2 + "'");
        }
        if (str2.contains(str1)) {
            System.out.println("Chuỗi '" + str2 + "' chứa chuỗi: '" + str1 + "'");
        } else {
            System.out.println("Không có chuỗi nào chứa chuỗi nào");
        }

    }
}
