package chatbot;

/**
 * @authors Anthony, Ryan, and Kevin Last Edited: April 30th, 2019
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import weka.classifiers.WekaWrapper;
import weka.core.Instances;

public class ChatBot {

    public static void main(String[] args) throws Exception {

        String ui;                              //user inputs stored here
        cB chat = new cB();        //chatBot class for set/get and other methods
        Scanner user = new Scanner(System.in);  //scanner

        chat.opening();     //opening method in cB.java

        //lets user say hello
        System.out.print("User: ");
        ui = user.nextLine();

        System.out.println("S.A.M.: Hi there!");
        //This is where we find out the users name
        System.out.print("S.A.M.: What is your name?\nUser:");
        ui = user.nextLine();
        ui = ui.replace("My name is ", "");
        chat.setUName(ui);

        switch (chat.getUName()) {
            case "Anthony":
                System.out.println("S.A.M.: Hello Creator!");
                break;
            case "Kevin":
                System.out.println("S.A.M.: Hello Creator!");
                break;
            case "Ryan":
                System.out.println("S.A.M.: Hello Creator!");
                break;
            default:
                break;
        }

        System.out.println("S.A.M.: It is very nice to meet you, "
                + chat.getUName());
        chat.standFor();

        //day of the week
        System.out.println("S.A.M.: What day of the week is it today?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace("its", "");
        ui = ui.replace("it is", "");
        ui = ui.replace("today is", "");
        ui = ui.replace("today", "");
        ui = ui.replace(" ", "");

        String week[] = {"monday", "tuesday", "wednesday", "thursday",
            "friday", "saturday", "sunday"};

        //small tree of answers for the day of the week
        if (ui.equals(week[0])) {
            System.out.println("S.A.M.: OH I HATE MONDAYS");
        } else if (ui.equals(week[1])) {
            System.out.println("S.A.M.: As long as its not monday!");
        } else if (ui.equals(week[2])) {
            System.out.println("S.A.M.: Half way there!");
        } else if (ui.equals(week[3])) {
            System.out.println("S.A.M.: Almost Friday");
        } else if (ui.equals(week[4])) {
            System.out.println("S.A.M.: IT'S FRIDAY");
        } else if (ui.equals(week[5])) {
            System.out.println("S.A.M.: Time to party");
        } else if (ui.equals(week[6])) {
            System.out.println("S.A.M.: Oh no! It's almost Monday");
        } else {
            System.out.println("S.A.M.: That is not a day");
            chat.setDay("S.A.M.: You did not give me a real day");
        }

        chat.setDay(ui);

        //determining the weather
        System.out.println("S.A.M.: How is the weather out today, " + chat.getUName() + " ?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace("today is", "");
        ui = ui.replace("it is", "");
        ui = ui.replace("its", "");
        ui = ui.replace("it's", "");
        ui = ui.replace("outside", "");
        ui = ui.replace("today it is", "");
        ui = ui.replace("today", "");
        ui = ui.replace(" ", "");
        String outlook = ui;

        System.out.println("S.A.M.: Do you need an umbrella, " + chat.getUName() + " ?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace("i do not", "");
        ui = ui.replace("i dont", "");
        ui = ui.replace("i don't", "");
        ui = ui.replace("i do", "");
        String umbrella = ui;

        System.out.println("S.A.M.: How about a jacket?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace("i do not", "");
        ui = ui.replace("i dont", "");
        ui = ui.replace("i don't", "");
        ui = ui.replace("i do", "");
        String jacket = ui;

        String x[] = {outlook, umbrella, jacket};   //array of answers
        WekaWrapper ww = new WekaWrapper();
        try {
            //do this for every one 
            Instances unlabeled = new Instances(new BufferedReader(
                    new FileReader("C:\\Program Files\\S.A.M\\weather.arff")));
            unlabeled.setClassIndex(unlabeled.numAttributes() - 1);

            for (int i = 0; i < unlabeled.numInstances(); i++) {
                double clsLabel = ww.classifyInstance(unlabeled.instance(i));
                if (weather.classify(x) == clsLabel) {
                    System.out.println(unlabeled.classAttribute().value((int) clsLabel));
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //school
        System.out.println("S.A.M.: Are you in school? Like do you go to school?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace("i do", "");
        ui = ui.replace("i dont", "");
        ui = ui.replace("i don't", "");
        ui = ui.replace(" ", "");
        String[] responses = {"yes", "yeah", "yea", "yep", "yup",};

        String o = null;
        for (int i = 0; i < responses.length; i++) {
            if (responses[i].equals(ui)) {
                o = responses[i];
                ui = o;
                i = responses.length;
            }
        }
        String typeOfDegree;
        String aOrS;
        String deans;
        if (ui.equals(o)) {

            System.out.println("S.A.M.: Where do you go?");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            chat.setCollege(ui);

            System.out.println("S.A.M.: Oh cool, what's your major?");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            chat.setMajor(ui);

            System.out.println("S.A.M.: What kind of degree are you going for?");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            ui = ui.toLowerCase();
            typeOfDegree = ui;

            System.out.println("S.A.M.: Arts or Science?");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            ui = ui.toLowerCase();
            aOrS = ui;

            System.out.println("S.A.M.: Are you on the dean's list?");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            ui = ui.toLowerCase();
            deans = ui;
            
            String a[] = {typeOfDegree, aOrS, deans};
            try {

                Instances unlabeled = new Instances(new BufferedReader(
                        new FileReader("C:\\Program Files\\S.A.M\\degree.arff")));
                unlabeled.setClassIndex(unlabeled.numAttributes()-1);

                for (int i = 0; i < unlabeled.numInstances(); i++) {
                    double clsLabel = ww.classifyInstance(unlabeled.instance(i));
                    if (degree.classify(a) == clsLabel) {
                        System.out.println(unlabeled.classAttribute().value((int) clsLabel));

                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (ui.equals("no")) {
            chat.setMajor("S.A.M.: You don't go to school");
            chat.setCollege("S.A.M.: You don't go to school");
        }
        //work
        System.out.println("S.A.M.: Do you work?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace(" ", "");
        ui = ui.replace("i do", "");
        ui = ui.replace("i dont", "");
        ui = ui.replace("i don't", "");

        if (ui.equals("yes")) {
            System.out.println("S.A.M.: Where do you work? ");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            chat.setWork(ui);
        } else {
            System.out.println("S.A.M.: Wow you don't work? You're lucky!");
            chat.setWork("S.A.M.: You don't work");
        }

        //hobbies
        System.out.println("S.A.M.: Do you have any hobbies?");
        System.out.print(chat.getUName() + ": ");
        ui = user.nextLine();
        ui = ui.toLowerCase();
        ui = ui.replace(" ", "");
        ui = ui.replace("i do", "");
        ui = ui.replace("i dont", "");
        ui = ui.replace("i don't", "");

        if (ui.contains("yes")) {
            System.out.println("S.A.M.: What is your favorite hobby");
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            chat.setHobby(ui);
        } else {
            System.out.println("S.A.M.: Oh ok! I was just wondering!");
            chat.setHobby("You don't have any hobbies");
        }
        if (chat.getCollege().equals("S.A.M.: You don't go to school")) {
            if (chat.getWork().equals("S.A.M.: You don't work")) {
                if (chat.getHobby().equals("You don't have any hobbies")) {
                    System.out.println("S.A.M.: You should really do something "
                            + "with your life!");
                }
            }
        }

        System.out.println("S.A.M.: I have learned so much about you! I bet if you asked me "
                + "any questions about you or about me I could answer them! Let's try! (Say goodbye to end the our nice conversation)");

        while (!ui.equals("goodbye")) {
            System.out.print(chat.getUName() + ": ");
            ui = user.nextLine();
            ui = ui.toLowerCase();
            ui = ui.replace("?", "");

            System.out.print("S.A.M.: ");

            if (ui.endsWith("work")) {
                System.out.println(chat.getWork());
            } else if (ui.endsWith("name")) {
                System.out.println(chat.getUName() + ",duh");
            } else if (ui.endsWith("created") || ui.endsWith("made")) {
                chat.created();
            } else if (ui.endsWith("today") && ui.startsWith("what") && !ui.contains("weather")) {
                System.out.println(chat.getDay());
            } else if (ui.endsWith("hobby")) {
                System.out.println(chat.getHobby());
            } else if (ui.endsWith("major")) {
                System.out.println(chat.getMajor());
            } else if (ui.endsWith("school")) {
                System.out.println(chat.getCollege());
            } else if (ui.endsWith("today") && ui.contains("weather")) {
                System.out.println("Today was" + outlook);
            } 
        }
        System.out.println("Goodbye, " + chat.getUName());
    }
}
