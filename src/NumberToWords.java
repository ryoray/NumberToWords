public class NumberToWords {

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        // Check digit for zero number
        int numOfZero = getDigitCount(number) - getDigitCount(reverse(number));

        // reverse the number using method reverse
        int revNumber = reverse(number);

        int extNum = 0;
        String numInWord = "";

        // Convert number to word 47800 --> four seven eight zero zero
        while (revNumber > 0) {
            extNum = revNumber % 10;
            switch (extNum) {
                case 0:
                    numInWord = "Zero";
                    break;
                case 1:
                    numInWord = "One";
                    break;
                case 2:
                    numInWord = "Two";
                    break;
                case 3:
                    numInWord = "Three";
                    break;
                case 4:
                    numInWord = "Four";
                    break;
                case 5:
                    numInWord = "Five";
                    break;
                case 6:
                    numInWord = "Six";
                    break;
                case 7:
                    numInWord = "Seven";
                    break;
                case 8:
                    numInWord = "Eight";
                    break;
                default:
                    numInWord = "Nine";
                    break;
            }
            System.out.println(numInWord);
            revNumber /= 10;
        }

        //Add Zero at the back
        if (numOfZero > 0) {
            for (int i=0; i < numOfZero; i++ ) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse (int number) {
        int extractDigit;
        int revNum = 0;

        if (number < 0) {
            number = (number) * -1;
            while (number > 0) {
                extractDigit = number % 10;
                revNum = extractDigit + (revNum * 10);
                number /= 10;
            }
            revNum *= -1;
        }
        while (number > 0) {
            extractDigit = number % 10;
            revNum = extractDigit + (revNum * 10);
            number /= 10;
        }
        return revNum;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }

        int digit = 0;
        while (number != 0) {
            digit++;
            number /= 10;
        }
        if (digit == 0){
            digit = 1;
        }
        return digit;
    }
}
