package ru.irinatik.springbutcher.quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.irinatik.springbutcher.annotations.InjectRandomInt;
import ru.irinatik.springbutcher.annotations.PostProxy;
import ru.irinatik.springbutcher.annotations.Profiling;

import javax.annotation.PostConstruct;

@Component("terminatorQuoter")
@Profiling
public class TerminatorQuoter implements Quoter {

    @Value("${terminator.quote}")
    private String message;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Constructor repeat = " + repeat);
    }

    @PostConstruct
    public void init() {
        System.out.println("Init repeat = " + repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
