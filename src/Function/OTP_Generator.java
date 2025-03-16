package Function;
import java.util.*;
public class OTP_Generator {
    static int otpGen(int n){
        int otp =0;
        for(int i=0;i<n;i++){
            otp += Math.floor(Math.random()*10);
        }
        return otp;
    }
    public static void main(String[] args) {
        System.out.println(otpGen(4));
    }
}
