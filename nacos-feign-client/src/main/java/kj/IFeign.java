package kj;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="nacos-provider")
public interface IFeign {

    @GetMapping("/message")
    public String getMessage();
}
