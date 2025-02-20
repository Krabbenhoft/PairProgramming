//Created by Joshua Green and Isaac Krabbenhoft

package csu.csci325;


public class Runner extends TeamMember{
    protected int speed;
    protected int racesCompleted;
    protected int[] raceTypes;

    public boolean runRace(){
        boolean win=false;
        racesCompleted++;
        if (speed + this.didStretch() > 7){
            win=true;
        }
        return win;
    }
    
    public int didStretch() {
        return (int) (Math.random()*6);
    }
    
    public Runner (String name, String teamName, int age, int meetsAttended, int speed, int racesCompleted, int[] raceTypes) {
        super(name, teamName, age, meetsAttended);
        this.speed=speed;
        this.racesCompleted=racesCompleted;
        this.raceTypes=raceTypes;
        
    }    
    
   
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getRaceTypes() {
        return raceTypes;
    }

    public void setRaceTypes(int[] raceTypes) {
        this.raceTypes = raceTypes;
    }
    
    
}
