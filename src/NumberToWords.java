public class NumberToWords {

    public static String numberToWords (int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        // reverse the number using method reverse
        number = reverse(number);

        int extNum = 0;
        String numInWord = "";

        // Convert number to word 47804 --> four seven eight zero four
        while (number > 0) {
            extNum = number % 10;
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
            if (number >= 10) {
                System.out.println(numInWord);
            }
            number /= 10;
        }
        return numInWord;
    }

    public static int reverse (int number) {
        int extractDigit;
        String revNum = "";

        // Reverse the number 1234 --> 4321
        while (number > 0) {
            extractDigit = number % 10;
            revNum += Integer.toString(extractDigit);
            number /= 10;
        }
        return Integer.parseInt(revNum);
    }

    public static int getDigitCount (int number) {
        
    }
}
