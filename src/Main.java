import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean validNum = false;

        System.out.println("Please enter a number (between -2,147,483,647 and 2,147,483,647) to be converted: ");

        while(!validNum) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                validNum = true;
            } else {
                input.nextLine();
            }
        }


        System.out.println(Converter.toText(number));



    }

}
