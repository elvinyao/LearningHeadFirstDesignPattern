package exp4.excersice;

public class CCarFactory implements CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ForeignEngine();
    }
}
