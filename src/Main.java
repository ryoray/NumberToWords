public class Main {
    public static void main(String[] args) {
        System.out.println(NumberToWords.getDigitCount(0));     //  1
        System.out.println(NumberToWords.getDigitCount(123));   //  3
        System.out.println(NumberToWords.getDigitCount(-12));   //  -1
        System.out.println(NumberToWords.getDigitCount(5200));  //  4

        System.out.println(NumberToWords.reverse(-121));        // -121
        System.out.println(NumberToWords.reverse(1212));        // 2121
        System.out.println(NumberToWords.reverse(1234));        // 4321
        System.out.println(NumberToWords.reverse(100));         // 1

        NumberToWords.numberToWords(123);          // one two three
        NumberToWords.numberToWords(1010);         // one zero one zero
        NumberToWords.numberToWords(1000);         // one zero zero zero
        NumberToWords.numberToWords(-12);          // Invalid value
    }
}
