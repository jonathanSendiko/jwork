package jonathan.jwork;

/**
 * Class Objek Bonus
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class Bonus {
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * Constructor untuk bonus yang tersedia
     * @param id id Bonus
     * @param referralCode referral code untuk penggunaan bonus
     * @param extraFee fee extra jika menggunakkan bonus
     * @param minTotalFee minimal fee yang dibutuhkan jika ingin menggunakkan bonus
     * @param active status bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active) {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * getter Id bonus
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * getter referral Code
     * @return referral Code
     */
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * getter Extra Fee
     * @return extraFee
     */
    public int getExtraFee() {
        return extraFee;
    }

    /**
     * getter minimal total fee
     * @return minTotalFee
     */
    public int getMinTotalFee() {
        return minTotalFee;
    }

    /**
     * getter status bonus
     * @return active
     */
    public boolean getActive() {
        return active;
    }

    /**
     * setter Id bonus
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * setter referral code
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * setter extra fee
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

    /**
     * setter minimal total fee
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }

    /**
     * setter status aktif atau tidaknya bonus
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + "\nReferral Code = " + getReferralCode() + "\nExtra Fee = " + getExtraFee()
                + "\nMin Total Fee= " + getMinTotalFee() + "\nActive Status =  " + getActive();
    }

}
