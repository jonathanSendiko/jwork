package jonathan.jwork;
public enum InvoiceStatus {
    Cancelled("Cancelled"), Finished("Finished"), Ongoing("Ongoing");

    private String status;

    private InvoiceStatus(String status) {
        this.status = status;

    }

    @Override
    public String toString() {
        return status;
    }

}