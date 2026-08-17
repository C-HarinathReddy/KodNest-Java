
class Mobile {

    void unlock(int pin) {
        System.out.println("Mobile unlocked using PIN: " + pin);
    }

    void unlock(String password) {
        System.out.println("Mobile unlocked using Password: " + password);
    }

    void unlock(Fingerprint fingerprint) {
        System.out.println("Mobile unlocked using Fingerprint");
    }

    void unlock(Face face) {
        System.out.println("Mobile unlocked using Face");
    }

    void unlock(Pattern pattern) {
        System.out.println("Mobile Unlocked using pattern");
    }
}

class Fingerprint {
}

class Face {
}

class Pattern {

}

class User {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        int pin = 1234;
        String password = "hello123";

        Fingerprint f = new Fingerprint();
        Face face = new Face();
        Pattern p = new Pattern();

        m.unlock(pin);
        m.unlock(password);
        m.unlock(f);
        m.unlock(face);
        m.unlock(p);
    }
}
