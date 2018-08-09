//inspired by http://xkcd.com/1188/

class Ball extends Throwable {}

class P {
    public static void main(String[] args) {
        P parent = new P(null);
        P child = new P(parent);
        parent.target = child;
        parent.aim(new Ball());
    }
}
