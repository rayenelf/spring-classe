package tn.esprit.twin.springclasse.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String sayHello(String name) {
        System.out.println("Inside sayHello");
        return "Hello " + name;
    }

    public void throwException() {
        System.out.println("Inside throwException");
        throw new RuntimeException("Exception de test");
    }
}
