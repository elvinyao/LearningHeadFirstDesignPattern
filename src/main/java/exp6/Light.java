package exp6;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public Light() {

    }

    public void on() {
        System.out.println(location + " Light on");
    }

    public void off() {
        System.out.println(location + " Light off");
    }
}

