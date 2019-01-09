package by.it.seroglazov.calc;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Parcer parcer = new Parcer();
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.next()).toUpperCase().equals("END")) {
            if (input.equalsIgnoreCase("printvar")) {
                System.out.println(Var.getVars());
            } else if (input.equalsIgnoreCase("sortvar")) {
                System.out.println(Var.getVars());

            } else if(input.equalsIgnoreCase("ru")){
                ResMan.changeLanguage(new Locale("ru", "RU"));
            } else if(input.equalsIgnoreCase("en")){
                ResMan.changeLanguage(Locale.ENGLISH);
            } else if(input.equalsIgnoreCase("be")){
                ResMan.changeLanguage(new Locale("be", "BY"));
            } else {
                try {
                    String res = parcer.calc(input);
                    printer.print(res);
                } catch (CalcException e){
                    System.out.println(e.getMessage());
                }

            }
        }

    }
}
