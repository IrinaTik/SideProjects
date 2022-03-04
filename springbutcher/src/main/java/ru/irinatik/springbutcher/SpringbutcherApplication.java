package ru.irinatik.springbutcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.irinatik.springbutcher.quoters.Quoter;

@SpringBootApplication
public class SpringbutcherApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("terminatorQuoter")
    private Quoter quoter;

    public static void main(String[] args) {
        SpringApplication.run(SpringbutcherApplication.class, args);
    }

    @Override
    public void run(String... args) throws InterruptedException {
        quoter.sayQuote();
    }
}
