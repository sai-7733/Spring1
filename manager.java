
public class manager {
    private teamlead mm;
    public void setM(teamlead mm){
        this.mm=mm;
    }
    public void doWork(){
        System.out.println("Manager Work Started");
    
        mm.doWork();
        System.out.println("Manager work completed");
    }
}
