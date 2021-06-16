package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah invoice dengan status ongoing ada atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Invoice Status: ");
        this.invoice_error = invoice_input;
    }

    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
