package Tourists;


import Locations.*;

public class Carangan implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("I have " + getBudget() + " in my wallet, it's time to travel and relax!");

        if ( budget > boracay.airFare){
            System.out.println("Alright, let's go to the Beach at Boracay!" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("No Boracay today my friend");
            budget = 0;
        }

      checkBudget();
    }

    public void visit(Canada canada) {

        if(budget >canada.airFare){
            System.out.println("Now going to the North! Canada!");
            budget -= canada.airFare;
        }else{
            System.out.println("No Canada today my friend");
        }

        checkBudget();
    }
    public void visit(Davao davao) {
        if(budget >davao.airFare){
            System.out.println("Davao Here we go!!!");
            budget -= davao.airFare;
        }else{
            System.out.println("No Davao for you today my friend");
            budget = 0;
        }

        checkBudget();
    }

    public void visit(Australia australia) {
        if(budget >australia.airFare){
            System.out.println("Hmm, I think I should go to Australia");
            budget -= australia.airFare;
        }else{
            System.out.println("Naur Kangaroos for you!");
            budget = 0;
        }

        checkBudget();
    }

    public void visit(Tagaytay tagaytay) {
        if(budget >tagaytay.airFare){
            System.out.println("Let's go to something that is Cold and chill at Tagaytay");
            budget -= tagaytay.airFare;
        }else{
            System.out.println("No cold breeze for you today");
            budget = 0;
        }

        checkBudget();
    }

    public void visit(Japan japan) {
        if(budget >japan.airFare){
            System.out.println("Arigatoo Japan");
            budget -= japan.airFare;
        }else{
            System.out.println("So sad no cherry blossoms today :((");
            budget = 0;
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("I have " + budget + " left in my wallet, what's next?");
    }

    public static int getBudget() {
        return budget;
    }

} 
    