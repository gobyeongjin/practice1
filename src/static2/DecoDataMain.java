package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

    }

}
