package Lesson2;

public class First {
    private static byte a;
    private static int b;
    private static String str;
    private static Integer max;

    public static void main(String[] args) {
        byte a = 7; //преобразование не требуетс€
        int b = 5;
        double d = a + b;
        String str = "¬сем привет!";
        Integer.max(a = 7, b = 5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
        System.out.println(Integer.max(a = 7, b = 5));
        System.out.println(d);
    }
}
