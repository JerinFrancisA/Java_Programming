package NumberConversion;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

class Bin {
    void toBin(int n) {
        String b = new String("");
        while (n > 0) {
            b = Integer.toString(n % 2) + b;
            n = n / 2;
        }
        System.out.println(b);
    }

    void fromBin(String n) {
        int b = 0;
        for (int i = n.length() - 1, j = 0; i >= 0; i--, j++) {
            b += Integer.parseInt(Character.toString(n.charAt(i))) * Math.pow(2, j);
        }
        System.out.println(b);
    }
}

class Oct {
    void toOct(int n) {
        String o = new String("");
        while (n > 0) {
            o = Integer.toString(n % 8) + o;
            n = n / 8;
        }
        System.out.println(o);
    }

    void fromOct(String n) {
        int o = 0;
        for (int i = n.length() - 1, j = 0; i >= 0; i--, j++) {
            o += Integer.parseInt(Character.toString(n.charAt(i))) * Math.pow(8, j);
        }
        System.out.println(o);
    }
}

class Hex {
    void toHex(int n) {
        String h = new String("");
        while (n > 0) {
            h = Integer.toString(n % 16) + h;
            switch (h) {
            case "10":
                h = "A";
                break;
            case "11":
                h = "B";
                break;
            case "12":
                h = "C";
                break;
            case "13":
                h = "D";
                break;
            case "14":
                h = "E";
                break;
            case "15":
                h = "F";
                break;
            default:
                break;
            }
            n = n / 16;
        }
        System.out.println(h);
    }

    void fromHex(String n) {
        int h = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('A', 10);
        m.put('B', 11);
        m.put('C', 12);
        m.put('D', 13);
        m.put('E', 14);
        m.put('F', 15);

        for (int i = n.length() - 1, j = 0; i >= 0; i--, j++) {
            if (n.charAt(i) == 'A' || n.charAt(i) == 'B' || n.charAt(i) == 'C' || n.charAt(i) == 'D'
                    || n.charAt(i) == 'E' || n.charAt(i) == 'F') {
                h += m.get(n.charAt(i)) * Math.pow(16, j);
            } else {
                h += Integer.parseInt(Character.toString(n.charAt(i))) * Math.pow(16, j);
            }
        }
        System.out.println(h);
    }
}

public class BinOctHex {
    public static void main(String[] args) {
        Bin b = new Bin();
        Oct o = new Oct();
        Hex h = new Hex();
        b.toBin(255);
        b.fromBin("111111");
        o.toOct(5335);
        o.fromOct("1001011");
        h.toHex(9345);
        h.fromHex("ABCD2487F");
    }
}