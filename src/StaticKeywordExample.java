public class StaticKeywordExample {
    public static int i=20;
    static {
        System.out.println("a");
        i = 100;
    }

    public static void m1() {
        System.out.println("from m1");
    }

    StaticKeywordExample() {
        i = 50;
    }

}
