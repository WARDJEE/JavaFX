package week04.numericalSystemsConverter.model;

public class ModelConverter {

    public enum NumericalSystems {
        BINARY, OCTAL, HEXA;
    }

    public ModelConverter() {
        // Constructor
    }

    // methods with business logic
    public String convertToNumericalSystem(String decimalValue, NumericalSystems numericalSystem) throws IllegalArgumentException, NumberFormatException {
        int decValue;
        String result;

        try {
            decValue = Integer.parseInt(decimalValue);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("\"" + decimalValue + "\" is geen geldig getal.");
        }

        if (decValue < 0) {
            result = "Not a positive value!";
            throw new IllegalArgumentException("Geef een positief getal!");

        } else {
            switch (numericalSystem) {
                case BINARY -> result = Integer.toBinaryString(decValue);
                case OCTAL -> result = Integer.toOctalString(decValue);
                case HEXA -> result = Integer.toHexString(decValue);
                default -> result = "Something went wrong";
            }
        }


        return result;
    }


}
