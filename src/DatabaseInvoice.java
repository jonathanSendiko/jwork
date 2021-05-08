import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                temp = invoice;
                return temp;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getJobByJobseeker(int jobseekerid) {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        boolean result = false;
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            } else {
                INVOICE_DATABASE.add(invoice);
                lastId = invoice.getId();
                System.out.println("Added");
                result = true;
            }
        }
        return result;

    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                invoice.setInvoiceStatus(InvoiceStatus.Ongoing);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id)throws InvoiceNotFoundException{
        boolean temp = false;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == invoice.getId()) {
                INVOICE_DATABASE.remove(invoice);
                temp = true;
                return temp;
            }
        }
        throw new InvoiceNotFoundException(id);

    }

}
