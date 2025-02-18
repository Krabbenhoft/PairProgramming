//Created by Joshua Green and Isaac Krabbenhoft

package csu.csci325;


public class Coach extends TeamMember{
    int numRunners;
    String coachingStyle;
    
        public Runner (String name, String teamName, int age, int meetsAttended, int speed, int numRunners, String coachingStyle) {
        super(name, teamName, age, meetsAttended);
        this.numRunners=numRunners;
        this.coachingStyle=coachingStyle;
    }   
}
