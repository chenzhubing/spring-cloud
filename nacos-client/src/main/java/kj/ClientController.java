package kj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("client-message")
    public String getMessageByServer(){
        System.out.println("===================");
       String result = restTemplate.getForObject("http://nacos-provider/message",String.class);
       System.out.println("=======:"+result);
       return result;
    }
}
