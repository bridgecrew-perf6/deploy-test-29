package codesquad.airbnb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hello2")
    public String helloHello() {
        return "hello world hello world";
    }
    
    @GetMapping("/hello3")
    public String helloHello() {
        return "안녕 희지니?";
    }
}
