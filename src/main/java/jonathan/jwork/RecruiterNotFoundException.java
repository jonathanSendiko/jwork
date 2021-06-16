package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah recruiter ada atau tidak apda database recruiter
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input)
    {
        super("Recruiter Id: ");
        recruiter_error = recruiter_input;
    }

    public String getMessage()
    {
        return super.getMessage() + recruiter_error + " not found";
    }


}
