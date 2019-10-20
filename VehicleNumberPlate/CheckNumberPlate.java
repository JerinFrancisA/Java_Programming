package VehicleNumberPlate;

/**
 * CheckNumberPlate
 */

class NumberPlate {
    String number;

    NumberPlate() {
    }

    NumberPlate(String n) {
        number = n;
    }

    boolean isValid() {
        if (number.substring(0, 2) == "KA") {
            if (Integer.parseInt(number.substring(3, 5)) >= 0 && Integer.parseInt(number.substring(3, 5)) <= 99) {
                if (Integer.parseInt(Character.toString(number.charAt(6))) >= 0
                        && Integer.parseInt(Character.toString(number.charAt(6))) <= 9) {
                    if (Integer.parseInt(Character.toString(number.charAt(7))) >= 0
                            && Integer.parseInt(Character.toString(number.charAt(7))) <= 9) {
                        if (Integer.parseInt(number.substring(9, number.length())) >= 0
                                && Integer.parseInt(number.substring(9, number.length())) <= 9999) {
                            return true;
                        }

                    }

                }
            }
        }
        return false;
    }
}

public class CheckNumberPlate {

    public static void main(String[] args) {
        NumberPlate n = new NumberPlate("KA 01 AA 3430");
        System.out.println(n.isValid());
    }
}