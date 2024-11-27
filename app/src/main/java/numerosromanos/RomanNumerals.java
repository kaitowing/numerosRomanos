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
        int currentDivider = 1000;
        int quotient;
        int dividerStep = 6;

        do {
            quotient = decimalValue / currentDivider;
            switch (currentDivider) {
                case 1000:
                    if (quotient == 0) {
                        if (decimalValue >= 900) {
                            romanRepresentation += "CM";
                            decimalValue -= 900;
                        }
                    } else {
                        if (decimalValue > 500) {
                            dividerStep++;
                        }
                    }
                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "M";
                    }
                    break;
                case 500:
                    if (quotient == 0) {
                        if (decimalValue >= 400) {
                            romanRepresentation += "CD";
                            decimalValue -= 400;
                        }
                    } else {
                        if (decimalValue > 100) {
                            dividerStep++;
                        }
                    }

                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "D";
                    }
                    break;
                case 100:
                    if (quotient == 0) {
                        if (decimalValue >= 90) {
                            romanRepresentation += "XC";
                            decimalValue -= 90;
                        }
                    } else {
                        if (decimalValue > 50) {
                            dividerStep++;
                        }
                    }

                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "C";
                    }
                    break;

                case 50:
                    if (quotient == 0) {
                        if (decimalValue >= 40) {
                            romanRepresentation += "XL";
                            decimalValue -= 40;
                        }
                    } else {
                        if (decimalValue > 10) {
                            dividerStep++;
                        }
                    }

                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "L";
                    }
                    break;
                case 10:
                    if (quotient == 0) {
                        if (decimalValue == 9) {
                            romanRepresentation += "IX";
                            return romanRepresentation;
                        }
                    } else if (decimalValue > 5) {
                        dividerStep++;
                    }

                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "X";
                    }
                    break;
                case 5:
                    if (quotient == 0) {
                        if (decimalValue == 4)
                            romanRepresentation += "IV";
                        else
                            for (int i = 0; i < decimalValue; i++) {
                                romanRepresentation += "I";
                            }

                        return romanRepresentation;
                    }

                    for (int i = 0; i < quotient; i++) {
                        romanRepresentation += "V";
                    }
                    break;
                default:
                    break;
            }

            decimalValue = decimalValue % currentDivider;
            dividerStep--;

            switch (dividerStep) {
                case 1:
                    currentDivider = 5;
                    break;

                case 2:
                    currentDivider = 10;
                    break;

                case 3:
                    currentDivider = 50;
                    break;

                case 4:
                    currentDivider = 100;
                    break;

                case 5:
                    currentDivider = 500;
                    break;
                case 6:
                    currentDivider = 1000;
                    break;
                default:
                    break;
            }
        } while (decimalValue > 0);

        return romanRepresentation;
    }

    private boolean checkValidEntry(int decimalValue) {
        return decimalValue > 0 && decimalValue < 4000;
    }
}