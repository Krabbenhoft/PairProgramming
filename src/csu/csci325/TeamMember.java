//Created by Joshua Green and Isaac Krabbenhoft
package csu.csci325;


public class TeamMember {
    protected String name;
    protected String teamName;
    protected int age;
    protected int meetsAttended;

    public void quitTeam () {
        teamName=null;
    }
    
    public void attendMeet () {
        meetsAttended++;
    }
    
    public TeamMember(String name, String teamName, int age, int meetsAttended) {
        this.name = name;
        this.teamName = teamName;
        this.age = age;
        this.meetsAttended = meetsAttended;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMeetsAttended() {
        return meetsAttended;
    }

    public void setMeetsAttended(int meetsAttended) {
        this.meetsAttended = meetsAttended;
    }
    
    
    
}
