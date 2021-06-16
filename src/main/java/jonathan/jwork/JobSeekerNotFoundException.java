package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah Job ada pada database
 * atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker ID: ");
        this.jobseeker_error = jobseeker_input;
    }

    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }

}