
public class Converter {

    public static String toText(int number) {
        String finalText = "";

        if(number % 100 <= 19){
            finalText = underTwenty(number);
        } else if(number/1000 >= 1){
            finalText = underTwenty(number / 1000) + "thousand ";
            number = number - ((number/1000) * 1000);
            finalText += convertHundreds(number);
        } else if(number/100 >= 1){
            convertHundreds(number);
        } else{
            finalText += convertTens(number / 10, number % 10);
        }

        return finalText;
    }

    public static String convertHundreds(int number){
        String text = "";
        text = underTwenty(number/100) + "hundred ";
        number = number - ((number/100) * 100);
        text += convertTens(number / 10, number % 10);
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
            default:
                result = "not a number";
        }

        result = result + underTwenty(ones);
        return result;
    }

    public static String underTwenty(int number){
        switch(number){
            case 0:
                return "zero ";
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
            default:
                return "not a number ";
        }
    }

}
