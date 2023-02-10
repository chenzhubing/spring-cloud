package kj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private IFeign iFeign;

    @GetMapping("client-message")
    public String getMessageByServer(){
       String result = iFeign.getMessage();
       System.out.println("=======:"+result);
       return result;
    }
}
