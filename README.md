# spring-cloud
nacos+openFeign的实现：
1. Spring Boot 启动类上使用注解 @EnableFeignClients 开启 OpenFeign
2.使用 @FeignClient + @GetMapping/@PostMapping 调用服务提供者的接口
3.在客户端中注入 Feign Client 对象，像调用本地方法一样调用远程接口
