package sandbox.springbootsandbox;

import org.springframework.stereotype.Component;

@Component
public class ConsoleOut implements Out {
    @Override
    public void out(String value) {
        System.out.println(value);
    }
}
