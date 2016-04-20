
public class Converter {

    public static String toText(int number) {
        String finalText = "";
        String placeholder = "";
        boolean isNeg = false;


        if(number == 0){
            return "zero ";
        }

        if(number < 0){
            number = Math.abs(number);
            isNeg = true;
        }


        // convert 1,000,000,000 - integer limit
        if(number / 1000000000 >= 1){

            finalText = processThree(number, 1000000000, "billion ");
            finalText += processThree(number, 1000000, "million ");
            finalText += processThree(number, 1000, "thousand ");
            finalText += convertHundreds(number % 1000);

        // convert 1,000,000 - 999,999,999
        } else if(number/1000000 >= 1){

            finalText += processThree(number, 1000000, "million ");
            finalText += processThree(number, 1000, "thousand ");
            finalText += convertHundreds(number % 1000);

        // convert 1,000-999,999
        } else if(number/1000 >= 1){

            finalText += processThree(number, 1000, "thousand ");
            finalText += convertHundreds(number % 1000);

        // convert 100-999
        } else if(number/100 >= 1) {

            finalText += convertHundreds(number);

        // convert 1-19
        } else if(number % 100 <= 19 && number % 100 > 0){

            finalText = underTwenty(number);

        //convert 20-99
        } else{
            finalText += convertTens(number);
        }


        if(isNeg){
            finalText = "negative " + finalText;
        }
        return finalText;
    }

    /**
     * Processes chunks of three digits for billions, millions, thousands and adds the appropriate suffix
     * @param number
     * @param divisor
     * @param suffix The string to append to denote billion, million, thousand
     * @return A string representing the three digits in text form, plus a suffix if necessary
     */
    private static String processThree(int number, long divisor, String suffix){
        String placeholder = overOneThousand((int)(number % (divisor * 1000)/(divisor)));
        if(!placeholder.equals("")){
            return placeholder + suffix;
        } else {
            return "";
        }
    }

    /**
     * Processes numbers over one thousand
     * @param number A one to three digit integer to be converted into text
     * @return The string representing the three digit integer
     */
    private static String overOneThousand(int number){
        String text = "";

        if(number % 100 < 20 && number % 100 > 0) {
            text = underTwenty(number / 1000);
        } else {
            text += convertHundreds(number/1000);
        }

        number %= 1000;
        text += convertHundreds(number);
        return text;
    }

    /**
     * Processes numbers between 100-999
     * @param number A three digit integer
     * @return A string representing the integer in text
     */
    private static String convertHundreds(int number){
        String text = "";
        text = underTwenty(number / 100);
        if(!text.equals("")){
            text += "hundred ";
        }
        number %= 100;
        if(number <= 19){
            text += underTwenty(number);
        } else {
            text += convertTens(number);
        }

        return text;
    }

    /**
     * Recognizes the tens digit and turns it into the relevant text
     * @param number A number between 20-99
     * @return The text represented by the tens digit (i.e. twenty, thirty, forty)
     */
    private static String convertTens(int number){
        String result = "";

        switch(number / 10){
            case 2:
                result = "twenty ";
                break;
            case 3:
                result = "thirty ";
                break;
            case 4:
                result = "forty ";
                break;
            case 5:
                result = "fifty ";
                break;
            case 6:
                result = "sixty ";
                break;
            case 7:
                result = "seventy ";
                break;
            case 8:
                result = "eighty ";
                break;
            case 9:
                result = "ninety ";
                break;
        }

        result += underTwenty(number % 10);
        return result;
    }

    /**
     * Processes numbers between 1-19 (special cases)
     * @param number An integer between 1-19
     * @return The text representing that integer
     */
    private static String underTwenty(int number){
        switch(number){
            case 1:
                return "one ";
            case 2:
                return "two ";
            case 3:
                return "three ";
            case 4:
                return "four ";
            case 5:
                return "five ";
            case 6:
                return "six ";
            case 7:
                return "seven ";
            case 8:
                return "eight ";
            case 9:
                return "nine ";
            case 10:
                return "ten ";
            case 11:
                return "eleven ";
            case 12:
                return "twelve ";
            case 13:
                return "thirteen ";
            case 14:
                return "fourteen ";
            case 15:
                return "fifteen ";
            case 16:
                return "sixteen  ";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen ";
            case 19:
                return "nineteen ";

        }

        return "";
    }

}
