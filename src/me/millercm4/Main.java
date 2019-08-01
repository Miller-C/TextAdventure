
package me.millercm4;

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        first();
    }
        public static void first()
        {
        String message = "";
        System.out.println("Welcome. What would you like to do? Look around. Walk outside. Walk forward.");
            message = scanner.nextLine();
        if (message.equalsIgnoreCase("Look around"))
        {
            lookAroundBar();
        }
        else if (message.equalsIgnoreCase("Walk outside"))
        {
            System.out.println("As you walk outside you hear a loud gunshot and feel a sharp pain in your chest. You fall forward onto the street and die. END.");
        }
        else if (message.equalsIgnoreCase("Walk forward"))
        {
            walkForward();
        }
        else
        {
            System.out.println("Try again.");
            first();
        }
    }
    public static void lookAroundBar()
    {
        String message;
        System.out.println("You are currently standing in what looks to be a pub room. You are facing the bar with stairs to you left, the exit behind you and an upward leading staircase to your left. Tables and chairs are set up about the room with a few guests at some of the tables. What would you like to do? Walk outside. Walk forward.");
        message = scanner.nextLine();
        if (message.equalsIgnoreCase("Walk outside"))
        {
            System.out.println("As you walk outside you hear a loud gunshot and feel a sharp pain in your chest. You fall forward onto the street and die. END.");
        }
        if (message.equalsIgnoreCase("Walk forward"))
        {
            walkForward();
        }
    }
    public static void walkForward()
    {
        String message;
        System.out.println("As you walk towards the counter, a burly man with a neatly kept beard steps out through the doorway from behind the bar. He asks in a deep voice, \"How may I help you?\" Drink. Food. Where am I?");
        message = scanner.nextLine();
        if (message.equalsIgnoreCase("Drink"))
        {
            System.out.println("You ask for a drink you fancy and the man brings it out. You take a long swing. After a few seconds, your limbs seize up and you fall short of breath. The man looks at you oddly as you struggle to speak. You fall over backwards, out of your chair, and suffer a heat attack. END.");
        }
        if (message.equalsIgnoreCase("Food"))
        {
            System.out.println("You ask for the special and the man brings out what looks to be fried fish with a side of assorted, seasoned vegetables. As you cut into the fish and take your first bite, you begin coughing in a fit. The bartender looks slightly alarmed and you stand up frantically. You spit out the remaining food but find that you are still unable to breath. The bartender rushes from behind the counter to aid you, but it's too late. As your body depletes the remaining oxygen from your body, you collapse as everything fades to darkness. You have died of suffocation. END.");
        }
        if (message.equalsIgnoreCase("Where am I"))
        {
            System.out.println("\"Why, you're currently inside the Roaming Boar! Snuggled nicely into the upper right corner of Korsvael, the grandest city south of the Borlatosh River! You're not lost, are you?\" Respond: I don't remember coming here. What makes Korsvael so grand? Of course not, could I have some (food/drink)?");
        }
    }
}
