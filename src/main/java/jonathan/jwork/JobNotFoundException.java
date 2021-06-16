package jonathan.jwork;

/**
 * Class exception untuk mengecek apakah Job ada pada database
 * atau tidak
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class JobNotFoundException extends Exception{

    private int job_error;

    public JobNotFoundException(int job_input){
        super("Job ID: ");
        this.job_error = job_input;
    }

    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }
}