
public class Converter {

    public static String toText(int number) {
        String finalText = "";
        boolean isNeg = false;

        if(number == 0){
            return "zero ";
        }

        if(number < 0){
            number = Math.abs(number);
            isNeg = true;
        }


        if(number/1000 >= 1 && number/1000 <= 19){
            finalText = underTwenty(number / 1000) + "thousand ";
            number %= 1000;
            finalText += convertHundreds(number);
        } else if(number/1000 >= 1){
            finalText = convertThousands(number / 1000);
            number -= ((number/1000) * 1000);
            finalText += convertHundreds(number);
        } else if(number/100 >= 1) {
        finalText += convertHundreds(number);
        } else if(number % 100 <= 19 && number % 100 > 0){
            finalText = underTwenty(number);
        } else{
            finalText += convertTens(number / 10, number % 10);
        }


        if(isNeg){
            finalText = "negative " + finalText;
        }
        return finalText;
    }

    public static String convertThousands(int number){
        String text = "";
        text = underTwenty(number / 100);
        number %= 100;
        text += convertHundreds(number);
        text += "thousand ";
        return text;
    }

    public static String convertHundreds(int number){
        String text = "";
        text = underTwenty(number / 100);
        if(text != ""){
            text += "hundred ";
        }
        number %= 100;
        if(number <= 19){
            text += underTwenty(number);
        } else {
            text += convertTens(number / 10, number % 10);
        }

        return text;
    }

    public static String convertTens(int tens, int ones){
        String result = "";

        switch(tens){
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

        result = result + underTwenty(ones);
        return result;
    }

    public static String underTwenty(int number){
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
