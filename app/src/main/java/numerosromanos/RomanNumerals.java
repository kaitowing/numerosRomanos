package numerosromanos;

public class RomanNumerals {

    public String toRoman(int decimalValue) {
        if (!checkValidEntry(decimalValue)) {
            throw new IllegalArgumentException("Invalid input");
        }
        return convertEntryToRoman(decimalValue);
    }

    private String convertEntryToRoman(int decimalValue) {
        String romanRepresentation = "";
        while (true) {
            if (decimalValue >= 1000) {
                romanRepresentation += getRomanEquivalent(1000);
                decimalValue -= 1000;
            } else if (decimalValue >= 900) {
                romanRepresentation += getRomanEquivalent(900);
                decimalValue -= 900;
            } else if (decimalValue >= 500) {
                romanRepresentation += getRomanEquivalent(500);
                decimalValue -= 500;
            } else if (decimalValue >= 400) {
                romanRepresentation += getRomanEquivalent(400);
                decimalValue -= 400;
            } else if (decimalValue >= 100) {
                romanRepresentation += getRomanEquivalent(100);
                decimalValue -= 100;
            } else if (decimalValue >= 90) {
                romanRepresentation += getRomanEquivalent(90);
                decimalValue -= 90;
            } else if (decimalValue >= 50) {
                romanRepresentation += getRomanEquivalent(50);
                decimalValue -= 50;
            } else if (decimalValue >= 40) {
                romanRepresentation += getRomanEquivalent(40);
                decimalValue -= 40;
            } else if (decimalValue >= 10) {
                romanRepresentation += getRomanEquivalent(10);
                decimalValue -= 10;
            } else if (decimalValue >= 9) {
                romanRepresentation += getRomanEquivalent(9);
                decimalValue -= 9;
            } else if (decimalValue >= 5) {
                romanRepresentation += getRomanEquivalent(5);
                decimalValue -= 5;
            } else if (decimalValue >= 4) {
                romanRepresentation += getRomanEquivalent(4);
                decimalValue -= 4;
            } else if (decimalValue >= 1) {
                romanRepresentation += getRomanEquivalent(1);
                decimalValue -= 1;
            } else {
                return romanRepresentation;
            }
        }
    }

    private String getRomanEquivalent(int decimalValue) {
        switch (decimalValue) {
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
            default:
                return "";
        }
    }

    private boolean checkValidEntry(int decimalValue) {
        return decimalValue > 0 && decimalValue < 4000;
    }
}