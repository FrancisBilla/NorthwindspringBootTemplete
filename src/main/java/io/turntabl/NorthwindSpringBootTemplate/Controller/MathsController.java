package io.turntabl.NorthwindSpringBootTemplate.Controller;

import io.turntabl.NorthwindSpringBootTemplate.Model.Number;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @RequestMapping("/add")
    public Number add(
            @RequestParam(required = true, defaultValue = "1")Integer num1,
            @RequestParam(required = true, defaultValue = "1")Integer num2){

        return new Number(num1 + num2) {
        };
    }


    @RequestMapping("/subtract")
    public Number subtract(
            @RequestParam(required = true, defaultValue = "2")Integer num1,
            @RequestParam(required = true, defaultValue = "1")Integer num2){
        // int value = new
         return new Number(num1 - num2);
    }

}
