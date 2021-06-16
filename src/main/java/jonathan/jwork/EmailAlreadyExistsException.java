package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah email jobseeker sudah ada sebelumnya pada database
 * atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class EmailAlreadyExistsException extends Exception {

    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        this.jobseeker_error = jobseeker_input;
    }

    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";
    }
}