package z.test.springboot3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstCon {

    @GetMapping("/first")
    public String testFirstCon(){
        return "Hello World!";
    }

}
