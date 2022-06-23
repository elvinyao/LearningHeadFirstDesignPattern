package exp4.excersice;

public class AnimalClient {
    public static void main(String[] args) {
        CarFactory Aaa = new ACarFactory();
        Aaa.createEngine().engine();
        Aaa.createTire().tire();

        CarFactory bbb = new BCarFactory();
        bbb.createTire().tire();
        bbb.createEngine().engine();
    }
}
