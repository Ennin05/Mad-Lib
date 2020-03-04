package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase 1
        String greeting;
        String name; //declared a variable
        Scanner keyboard;
        String place;
        String favPlace;
        String favFood;
        String favPeople;
        String timeOfPlace;
        String car;
        String character;
        String shoeBrand;
        String theme;
        String emotion;
        String season;
        String climax;
        String animal;
        String adjective;
        String color;
        String bodyPart;
        String country;
        String number;
        String familyReletive;
        String gender;

        // Phase 2
        //Initializing

        keyboard = new Scanner( System.in);



        System.out.println("Give me a dream vacation location");
        place = keyboard.nextLine();

        System.out.println("What is your favorite color?");
        color = keyboard.nextLine();

        System.out.println("Where were you born?");
        country = keyboard.nextLine();

        System.out.println("Give a digit");
        number = keyboard.nextLine();

        System.out.println("Who do you live with?");
        familyReletive = keyboard.nextLine();

        System.out.println("Where did you hurt yourself recently?");
        bodyPart = keyboard.nextLine();

        System.out.println("Describe school with one word");
        adjective = keyboard.nextLine();

        System.out.println("What time of year does football start");
        season = keyboard.nextLine();

        System.out.println("Name your favorite superhero from Avengers");
        character = keyboard.nextLine();

        System.out.println("What do you like to eat all the time?");
        favFood= keyboard.nextLine();

        System.out.println("Who do you admire the most?");
        favPeople= keyboard.nextLine();

        System.out.println("Tell me the most dangerous event you've seen");
        climax = keyboard.nextLine();

        System.out.println("When did you wake up today?");
        timeOfPlace = keyboard.nextLine();

        System.out.println("Insert your favorite vehicle");
        car = keyboard.nextLine();

        System.out.println("Name a popular shoe");
        shoeBrand = keyboard.nextLine();

        System.out.println("What is a lesson you acquired from a recent book you read");
        theme = keyboard.nextLine();

        System.out.println("How do you feel at the moment?");
        emotion = keyboard.nextLine();

        System.out.println("What pet would you like to have?");
        animal = keyboard.nextLine();

        System.out.println("Where do you like to go all the time?");
        favPlace = keyboard.nextLine();

        System.out.println("What is the gender of your closest friend?");
        gender = keyboard.nextLine();


        //Phase 3

        System.out.println("Hello Mr.Ennin, I am at "+ place +". \n" );
        System.out.println("I Like the place because it is "+ color +". \n");
        System.out.println("Taking a plane from my birthplace, "+ country +" ,where the population is only "+ number +" people', was not easy. \n");
        System.out.println("Saying goodbye to "+ familyReletive +" was not easy. I waved them goodbye until "+ bodyPart +" started to hurt. \n");
        System.out.println("It was my first time seeing a plane, and to be honest it was "+ adjective +". \n");
        System.out.println("Going to the airport in the "+ season +" is fun because that is when they they give nice warm blankets to passengers. \n");
        System.out.println("While I was on the plan I watched "+ character +" and ate a "+ favFood +" while watching it. \n");
        System.out.println("After it finished, I went read about "+ favPeople +" he is great. \n");
        System.out.println("Then, a few moments later, we had to deal with "+ climax +". \n");
        System.out.println(" The turbulence happened in "+ timeOfPlace +" and lasted till the morning. It was hard to sleep but I dreamt about a "+ car +" so it wasn't so bad. \n");
        System.out.println(" After the plan landed, the first thing i saw was that almost everyone was wearing "+ shoeBrand +". It is then I learned "+ theme +", because I thought all they wore was sandals. \n");
        System.out.println("I felt so "+ emotion +" when sitting the cab on my way to the "+ favPlace +". \n");
        System.out.println("To wrap things up I met Lebron James, went to the zoo and saw a "+ animal +", and fell in love with a "+ gender +" all in two weeks. \n");







        











    }
}
