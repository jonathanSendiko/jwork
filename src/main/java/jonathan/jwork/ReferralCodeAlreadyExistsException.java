package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah Bonus dengan referral code yang sama ada atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class ReferralCodeAlreadyExistsException extends Exception {

    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        this.referral_error = referral_input;
    }

    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}