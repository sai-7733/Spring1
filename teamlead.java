public class teamlead{
    private developer dd;
    public void setM(developer dd){
        this.dd=dd;
    }
    public void doWork(){
        System.out.println("Teamlead Work Started");

        dd.doWork();
        System.out.println("Teamlead work completed");
    }
}