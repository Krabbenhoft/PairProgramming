/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csu.csci325;

/**
 *
 * @author jlgreen
 */
public class TestPrep {
    public static void main(String[] args) {
        //Test case h. Quit team should set teamName to null. This is the 
        //auctual result.
        TeamMember bob = new TeamMember("Bob", "Rockets", 5,5);
        System.out.println("TeamName should be Rockets " + bob.getTeamName());
        bob.quitTeam();
        System.out.println("Team name should be null: " + bob.getTeamName());
        
        //Test case g. Attend meet called with argument 5 on TeamMember object
        //should add five to meetsAttended. This is
        //the auctual result.
        System.out.println("MeetsAttended should be 5: " + bob.getMeetsAttended());
        bob.attendMeet(5);
        System.out.println("MeetsAttended should be 10: " + bob.getMeetsAttended());

        //Test case f. Attend meet called with argument 0 on Runner object 
        //should have no effect on meetsAttended. This is the auctual result.
        int[] races = {400, 500};
        Runner bobby = new Runner("Bob", "Rockets", 5, 5, 5, 5, races);
        System.out.println("Meets attended should be 5: " + bobby.getMeetsAttended());
        bob.attendMeet(0);
        System.out.println("Meets attended should be 5: " + bobby.getMeetsAttended());
        
        //Test case e. Attend meet called with no argument on Runner object 
        //should incriment meetsAttended by 1. This is the auctual result.
        System.out.println("Meets attended should be 5: " +
                bobby.getMeetsAttended());
        bobby.attendMeet();
        System.out.println("Meets attended should be 6: " +
                bobby.getMeetsAttended());
        
        //Test case d. Calling run race on a runner object with a speed of 5
        //should return some true and some false values
        Runner freddy = new Runner("Bob", "Rockets", 5, 5, 5, 5, races);

        for(int i =0; i < 10; i++){
            System.out.println("Should have some T and some F: "
                    + freddy.runRace());
        }
        
        //This is where we are using Polymorphism for part 12, part twelve, of
        //the project.
        //There is a TeamMember object "Sam" that has been constructed
        //with the constructor of a Coach.
        //When attendMeet() is called the overridden method is called.
        //This is an example of runTime polymorphism because the polymorphism
        //Is the result of overriding instead of overloading.
        //The code should output "This coach attended the meet with 5 Runners"
        //as a result of the polymorphism.
        TeamMember sam = new Coach("Bob", "Rockets", 5,5, 5, "Distance");
        sam.attendMeet();
    }
    
}
