package jonathan.jwork;

/**
 * Class exception untuk class bonus untuk mengecek referral code
 * tersedia atau tida
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class BonusNotFound extends Exception {
    private int bonus_error;

    public BonusNotFound(int bonus_input){
        super("Referral Code ID: ");
        bonus_error = bonus_input;
    }

    public String getMessage() {
        return super.getMessage() + bonus_error + " not found";
    }

}