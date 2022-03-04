package ru.irinatik.springbutcher.quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.irinatik.springbutcher.annotations.InjectRandomInt;

@Component("terminatorQuoter")
public class TerminatorQuoter implements Quoter {

    @Value("${terminator.quote}")
    private String message;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Constructor repeat = " + repeat);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
