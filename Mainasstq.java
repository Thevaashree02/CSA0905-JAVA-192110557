class Superclass {
    int a;
    public Superclass(int a) {
        this.a = a;
    }
}
class Subclass extends Superclass {
    int b;
    public Subclass(int a, int b) {
        super(a); 
        this.b = b;
    }
    public void displayValues() {
        System.out.println("Superclass a: " + super.a); 
        System.out.println("Subclass b: " + b);
    }
}
public class Mainasstq {
    public static void main(String[] args) {
        int superValue = 100;
        int subValue = 200;
        Subclass sub = new Subclass(superValue, subValue);
        sub.displayValues();
    }
}
