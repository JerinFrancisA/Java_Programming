package Root;
import java.lang.Math;
/**
 * QuadRoot
 */
/**
 * Qu
 */
class Quad {
    float a, b, c;

    Quad() {
    }

    Quad(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void computeRoots() {
        double d = Math.pow(b, 2) - (4*a*c);
        double r1 = (-b + Math.sqrt(d)) / (2*a);
        double r2 = (-b - Math.sqrt(d)) / (2*a);
        System.out.println(r1 + " & " + r2);
    }
}

public class QuadRoot {

    public static void main(String[] args) {
        Quad q = new Quad(1, -4, 3);
        q.computeRoots();
    }
}