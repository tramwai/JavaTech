package casting;

public class ImplicitCasting {
    public static void main(String[] args) {
        // implicit casting = widening = upcasting
        byte b = 25;
        int i = b; // put the value of b inside of i;
        System.out.println(i); // implicit casting
        float f = 10.5F;
        double d = f;
        System.out.println(d);


    }
}
