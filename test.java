public class test {
    public static void main(String args[]){
        manager m=new manager();
       
        teamlead tt=new teamlead();
        m.setM(tt);
        developer dv=new developer();
        tt.setM(dv);
        m.doWork();
    }
}
