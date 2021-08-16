class TriangleClassifier {
    public static final String TAM_GIAC_ĐEU = "tam giác đều";
    public static final String TAM_GIAC_CAN = "tam giác cân";
    public static final String TAM_GIAC_THUONG = "tam giác thường";
    public static final String KHONG_PHAI_TAM_GIAC = "không phải tam giác";

    public static String triangle(int a, int b, int c) {
        boolean dieuKienTamGiacDeu = a == b || b == c || c == a;
        boolean dieuKienTamGiacCan = a == b && b == c;

        String result = "";
        if (a + b > c && b + c > a && c + a > b) {
            if (dieuKienTamGiacCan) {
                result = TAM_GIAC_ĐEU;
            } else if (dieuKienTamGiacDeu) {
                result = TAM_GIAC_CAN;
            } else {
                result = TAM_GIAC_THUONG;
            }
        } else {
            result = KHONG_PHAI_TAM_GIAC;
        }
        return result;
    }
}
