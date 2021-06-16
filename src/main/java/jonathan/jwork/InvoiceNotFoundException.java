package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah invoice ada pada database
 * atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found";
    }

}
