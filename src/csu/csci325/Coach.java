//Created by Joshua Green and Isaac Krabbenhoft

package csu.csci325;


public class Coach extends TeamMember{
    private int numRunners;
    private String coachingStyle;
    
    public Coach(String name, String teamName, int age, int meetsAttended, int numRunners, String coachingStyle){
        super(name, teamName, age, meetsAttended);
        this.numRunners = numRunners;
        this.coachingStyle = coachingStyle;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public String getCoachingStyle() {
        return coachingStyle;
    }

    public void setCoachingStyle(String coachingStyle) {
        this.coachingStyle = coachingStyle;
    }
    
    public void addMember(){
        this.numRunners++;
    }
    
    public void coachRunner(Runner runner){
        runner.setSpeed(runner.getSpeed()+1);
    }
    
    @Override public void attendMeet(){
        System.out.println("This coach attended the meet with " + numRunners + " Runners");
    }
}
