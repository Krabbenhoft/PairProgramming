/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Created by Joshua Green and Isaac Krabbenhoft
package csu.csci325;

/**
 *
 * @author jlgreen
 */
public class TestPrep {
    public static void main(String[] args){
        int[] testRaces = {100, 200, 400};
        Coach testCoach = new Coach("Charles", "Bucs", 50, 1, 5, "Distance");
        Runner testRunner = new Runner("Charles", "Bucs", 25, 10, 10, 20, testRaces);

        //letter A: TESTING MEETS ATTENDED
        testCoach.addMember();
        System.out.println("Number of runners should be 6. Acutal result is: " + testCoach.getNumRunners());
        
        //letter B: ATTEND MEET FOR COACH
        testCoach.attendMeet();
        System.out.println("THE LINE ABOVE SHOULD READ: \"This coach attended the meet with 6 Runners\"");
        
        //letter C: TESTING DID STRETCH
        System.out.println("DID STRETCH SHOULD RETURN A VALUE 1-5. the next 10 lines are the values returned");
        for(int i=0; i<10; i++){
            System.out.println(testRunner.didStretch());
        }
        
        //letter D(1): TESTING THAT IF A RUNNERS SPEED IS LESS THAN 10 RUNRACE() RETURNS FALSE
        testRunner.setSpeed(0);
        System.out.println("THE RESULT OF RUN RACE SHOULD BE FALSE. Actual value is: " + testRunner.runRace());
        
        //letter D(2): TESTING THAT IF A RUNNERS SPEED IS GREATER THAN 10 RUNRACE() RETURNS TRUE
        testRunner.setSpeed(20);
        System.out.println("THE RESULT OF RUN RACE SHOULD BE TRUE. Actual value is: " + testRunner.runRace());
    }
    
}
