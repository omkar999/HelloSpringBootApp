package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return "Greetings from Spring Boot! " + name;
    }
    
}
