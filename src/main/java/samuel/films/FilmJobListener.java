package samuel.films;

import java.util.List;
 
import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
 
public class FilmJobListener implements JobExecutionListener{
 
    private DateTime startTime, stopTime;
 
    public void beforeJob(JobExecution jobExecution) {
        startTime = new DateTime();
        System.out.println("Import Film Job started at :"+startTime);
    }
 
    public void afterJob(JobExecution jobExecution) {
        stopTime = new DateTime();
        System.out.println("Import Film Job stopped at :"+stopTime);
        System.out.println("Total time take in millis :"+getTimeInMillis(startTime , stopTime));
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Import Film job completed successfully");
            //Here you can perform some other business logic like cleanup
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            System.out.println("Import Film job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                System.err.println("exception :" +th.getLocalizedMessage());
            }
        }
    }
 
    private long getTimeInMillis(DateTime start, DateTime stop){
        return stop.getMillis() - start.getMillis();
    }
 
}
