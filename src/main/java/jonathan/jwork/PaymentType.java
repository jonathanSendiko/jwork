package jonathan.jwork;

/**
 * Class tipe data enum untuk tipe pembayaran
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public enum PaymentType {
    BankPayment("Bank Payment"), EwalletPayment("E-wallet Payment");

    private String payment;

    private PaymentType(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return payment;
    }

    // Driver method
    public static void main(String[] args) {
        PaymentType payment1 = PaymentType.BankPayment;
        PaymentType payment2 = PaymentType.EwalletPayment;
        System.out.println(payment1);
        System.out.println(payment2);
    }
}
