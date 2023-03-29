class Player{
    String sport, Name;
    int jersey_no;
}
class Cricket_Player extends Player{
    void display(){
        int runrate=10;
        sport="Cricket"; 
        Name="King Kohli";
        jersey_no=18;
        System.out.println("Sport= "+sport+"   Name=  "+Name+"   Jersey no.=  "+ jersey_no+"   Runrate=  "+runrate);
    }
}
class Football_Player extends Player{
    void display(){
        int goals_scored =360;
        sport="Football";
        Name="Lionel Messi";
        jersey_no=10;
        System.out.println("Sport= "+sport+"   Name=  "+Name+"   Jersey no.=  "+ jersey_no+"   Goals Scored=  "+goals_scored);
    }
}
class Hockey_Player extends Player{
    void display(){
        int goals_scored=400;
        sport="Hockey";
        Name="Major Dhyan Chand";
        jersey_no=01;
        System.out.println("Sport= "+sport+"   Name=  "+Name+"   Jersey no.=  "+ jersey_no+"   Goals scored= "+goals_scored);
    }
}
class Finally{
    public static void main(String args[]){
        Cricket_Player c=new Cricket_Player();
        Hockey_Player h=new Hockey_Player();
        Football_Player f=new Football_Player();
        h.display();
        System.out.println("\n");
        c.display();
        f.display();
    }
}