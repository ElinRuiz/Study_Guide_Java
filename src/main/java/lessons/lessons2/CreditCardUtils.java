package lessons.lessons2;

public class CreditCardUtils {

    public boolean isValid(String cardNumber) {
        if (cardNumber == null) {
            throw new IllegalArgumentException("Card number cannot be null");
        }

        if (cardNumber.length() < 13) {
            throw new IllegalArgumentException("Card number must be at least 13 digits");
        }

        int sum = 0;
        boolean doubleDigit = false;

        // Loop from right to left
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            char c = cardNumber.charAt(i);

            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Card number must contain only digits");
            }

            int digit = Character.getNumericValue(c);

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit; // flip every iteration
        }

        return sum % 10 == 0;
    }

    public String mask(String cardNumber) {
        if (cardNumber == null) {
            throw new IllegalArgumentException("Card number cannot be null");
        }
        if (cardNumber.length() < 4) {
            throw new IllegalArgumentException("Card number must have at least 4 digits to mask");
        }
        int unmaskedLength = 4;
        int maskedLength = cardNumber.length() - unmaskedLength;
        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < maskedLength; i++) {
            masked.append('*');
        }
        masked.append(cardNumber.substring(maskedLength));

        return masked.toString();
    }
}



