package tn.esprit.twin.springclasse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tn.esprit.twin.springclasse.Service.TestService;

@Component
public class TestRunner implements CommandLineRunner {

    private final TestService testService;

    public TestRunner(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Appel normal
        testService.sayHello("Rayen");

        // Appel qui lance une exception
        try {
            testService.throwException();
        } catch (Exception e) {
            System.out.println("Exception attrapée dans runner");
        }
    }
}
