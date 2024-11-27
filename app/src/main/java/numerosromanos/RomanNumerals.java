package numerosromanos;

public class RomanNumerals {

    public String toRoman(int decimalValue) {
        validateInput(decimalValue);
        return convertToRoman(decimalValue);
    }

    private void validateInput(int decimalValue) {
        if (decimalValue <= 0 || decimalValue >= 4000) {
            throw new IllegalArgumentException("Invalid input: value must be between 1 and 3999.");
        }
    }

    private String convertToRoman(int decimalValue) {
        String romanRepresentation = "";

        while (decimalValue > 0) {
            int romanValue = getRomanValue(decimalValue);
            romanRepresentation += getRomanEquivalent(romanValue);
            decimalValue -= romanValue;
        }

        return romanRepresentation;
    }

    private int getRomanValue(int decimalValue) {
        if (decimalValue >= 1000)
            return 1000;
        if (decimalValue >= 900)
            return 900;
        if (decimalValue >= 500)
            return 500;
        if (decimalValue >= 400)
            return 400;
        if (decimalValue >= 100)
            return 100;
        if (decimalValue >= 90)
            return 90;
        if (decimalValue >= 50)
            return 50;
        if (decimalValue >= 40)
            return 40;
        if (decimalValue >= 10)
            return 10;
        if (decimalValue >= 9)
            return 9;
        if (decimalValue >= 5)
            return 5;
        if (decimalValue >= 4)
            return 4;
        return 1;
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
                throw new IllegalArgumentException("No Roman equivalent for value: " + decimalValue);
        }
    }
}
