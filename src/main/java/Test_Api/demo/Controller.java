package Test_Api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/ping")
    public String ping(){
        return " i am alive !";
    }

    @GetMapping("/ping1")
    public String eping(){
        return " Hello EPING  !";
    }

     @GetMapping("/ping2")
    public String eping1(){
        return " i am Good ok okok okokokok !";
    }
}
