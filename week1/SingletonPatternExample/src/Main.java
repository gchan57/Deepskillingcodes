class Logger {
    private static Logger loginInstance = null;
   public String str;
    private Logger() {
        str="Logger initialised";
    }
    public static Logger Logger(){
        if(loginInstance==null){
            loginInstance=new Logger();
        }
        return loginInstance;
}}



public class Main {
    public static void main(String[] args) {
       Logger one=Logger.Logger();
       Logger two=Logger.Logger();
       System.out.println("Message of one "+one.str+" "+one.hashCode());
       System.out.println("Message of two "+two.str+" "+two.hashCode());

    }

}