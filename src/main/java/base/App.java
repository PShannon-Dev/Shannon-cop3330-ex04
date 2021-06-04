package base;

import java.util.Scanner;

public class App
{
    Scanner input = new Scanner(System.in);

    public static void main(String[] args)//main
    {
        //creating app instance
        App madLib = new App();

        //prompt for input
        System.out.print("Enter a noun: ");
        String nounOne = madLib.new_Noun();

        System.out.print("Enter a verb: ");
        String verbOne = madLib.new_Verb();

        System.out.print("Enter an adjective: ");
        String adjectiveOne = madLib.new_adjective();

        System.out.print("Enter an adverb: ");
        String adverbOne = madLib.new_adverb();

        String output = String.format("How is it that my %s always %s when my %s neighbor sits on the toilet %s?",
                nounOne, verbOne, adjectiveOne, adverbOne);

        System.out.println(output);
    }
    public String new_Noun()
    {
        String noun = input.nextLine();
        return noun;
    }
    public String new_Verb()
    {
        String verb = input.nextLine();
        return verb;
    }
    public String new_adjective()
    {
        String adjective = input.nextLine();
        return adjective;
    }
    public String new_adverb()
    {
        String adverb = input.nextLine();
        return adverb;
    }
}

