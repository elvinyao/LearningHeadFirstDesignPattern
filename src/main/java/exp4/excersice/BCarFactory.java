package exp4.excersice;

public class BCarFactory implements CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new ForeignEngine();
    }
}
