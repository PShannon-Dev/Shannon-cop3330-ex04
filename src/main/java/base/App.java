/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.util.Scanner;

public class App
{
    //class scanner to use methods
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)//main
    {
        //creating app instance
        App madLib = new App();

        //get inputs
        String nounOne = madLib.new_Noun();
        String verbOne = madLib.new_Verb();
        String adjectiveOne = madLib.new_adjective();
        String adverbOne = madLib.new_adverb();

        //string substitution
        String output = madLib.string_Substitution(nounOne, verbOne, adjectiveOne, adverbOne);

        //output
        System.out.println(output);
    }
    //the following are instance methods used by an instance of App
    public String new_Noun()
    {
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        return noun;
    }
    public String new_Verb()
    {
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        return verb;
    }
    public String new_adjective()
    {
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        return adjective;
    }
    public String new_adverb()
    {
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        return adverb;
    }
    public String string_Substitution(String nounOne, String verbOne, String adjectiveOne, String adverbOne)
    {
        return String.format("How is it that my %s always %s when my %s neighbor sits on the toilet %s?",
                nounOne, verbOne, adjectiveOne, adverbOne);
    }
}

