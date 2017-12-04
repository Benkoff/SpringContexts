package quoters;

import lombok.Data;

/*
 * @author Ben Novikov on December 2017
 */
@Data
public class TerminatorQuoter implements Quoter {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
