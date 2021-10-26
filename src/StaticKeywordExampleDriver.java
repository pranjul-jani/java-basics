public class StaticKeywordExampleDriver {
    static {
        System.out.println("b");
    }

    public static void main(String[] args) {
        System.out.println("c");
        System.out.println(StaticKeywordExample.i);
        StaticKeywordExample.m1();
    }
}
