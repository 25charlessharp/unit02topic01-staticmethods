import javax.naming.ldap.ManageReferralControl;
import javax.sql.rowset.spi.SyncResolver;

public class Solutions {
    public static int max3(int a, int b, int c) {
        if( a > b && a > c){
            return a;
        }
        else if( b > a && b > c){
            return b;
        }
        else{
            return c;
        }
    }

    public static double max3(double a, double b, double c) {
        if( a > b && a > c){
            return a;
        }
        else if( b > a && b > c){
            return b;
        }
        else{
            return c;
        }
    }

    public static boolean odd(boolean a, boolean b, boolean c) {
        int result = 0;
        if(a){
            result += 1;
        }
        if(b){
            result += 1;
        }
        if(c){
            result += 1;
        }
        if(result % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }


    public static boolean majority(boolean a, boolean b, boolean c){
        int result = 0;
        if(a){
            result += 1;
        }
        if(b){
            result += 1;
        }
        if(c){
            result += 1;
        }
        if(result >= 2){
            return true;
        }
        else{
            return false;
        }
    }


    public static double trigIdentity(double x) {
        return Math.sin(x) * Math.sin(x)  + Math.cos(x) * Math.cos(x);
    }


    public static void main(String[] args) {
        System.out.println(majority(true, true, true));
    }
}