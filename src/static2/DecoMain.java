package static2;

public class DecoMain {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco1 = utils.deco(s);

        System.out.println("before:" + s);
        System.out.println("after:" + deco1);
    }
}
