public class fforcast {
    public static double fvalue(double currentval,double growthrate,int year){
        if(year==0){
            return currentval;
        }
        return fvalue(currentval*(1+growthrate),growthrate,year-1);

            }
            public static void  main(String[] args){
        double currentval=10900;
        double grothroute=.01;
        int year=5;
        double res=fvalue(currentval,grothroute,year);
        System.out.println("Result :"+res);
            }
}
