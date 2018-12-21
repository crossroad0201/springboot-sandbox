package sandbox.springbootsandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements CommandLineRunner {

    private Out out;

    @Autowired
    public HelloWorld(Out out) {
        this.out = out;
    }

    @Override
    public void run(String... args) {
        out.out("Hello World!!!");
    }
}
