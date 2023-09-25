package programming.chapter9.errors_exception;

public class Exercise09p3 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b);
    }
}
class Base {
    public Base() {
        infob = "I am an object of the Base class";
    }
    public String getInfo() {
        return infob;
    }

    @Override
    public String toString() {
        return infob;
    }

    private String infob;
}

class Derived extends Base {
    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }
    @Override
    public String getInfo() {
        return infod + ", " + super.getInfo();
    }

    private String infod;
}