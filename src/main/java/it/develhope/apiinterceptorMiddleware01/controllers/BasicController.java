package it.develhope.apiinterceptorMiddleware01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;



@RestController()
@RequestMapping(value = "/time")
public class  BasicController {

    @GetMapping(value ="")
    public LocalDateTime dataTime(){
    return LocalDateTime.now();
    }
}
