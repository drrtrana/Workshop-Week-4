public class Decimals {
    public static String decimalDigits(double d) {
        int sum = 0;
        String decimal = d + "";
        int index = decimal.indexOf(".");
        String digits = "";
        if(index > 0) {
            for(int i = index + 1; i < decimal.length() - 1; i++) {
                digits += decimal.charAt(i) + " ";
                sum += Integer.parseInt(decimal.charAt(i) + "");
            }
            digits += decimal.charAt(decimal.length() - 1);
            sum += Integer.parseInt(decimal.charAt(decimal.length() - 1) + "");
        }
        else {
            digits = "0";
        }

        return "Digits after decimal point:\n" + digits+ "\nSum: " + sum;
    }

    public static String decimalDigits(double d1, double d2) {
        String d1String = d1 + "";
        String d2String = d2 + "";
        int index1 = d1String.indexOf(".");
        int index2 = d2String.indexOf(".");

        String decimal1 = d1String.substring(index1).replace(".", "");
        String decimal2 = d2String.substring(index2).replace(".", "");

        return "Digits after decimal point:\n" + decimal1 + ", " + decimal2 + "\nDigits are the same: " + decimal1.equals(decimal2);
    }
}
