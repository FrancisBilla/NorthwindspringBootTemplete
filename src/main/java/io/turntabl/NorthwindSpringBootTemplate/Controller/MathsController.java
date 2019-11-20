package io.turntabl.NorthwindSpringBootTemplate.Controller;

import io.swagger.annotations.Api;
import io.turntabl.NorthwindSpringBootTemplate.Maths;
import io.turntabl.NorthwindSpringBootTemplate.Model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathsController {

    @Autowired
    private Maths mathOperation;


    @GetMapping("/add")
    public Number add(
            @RequestParam(required = true, defaultValue = "1")Integer num1,
            @RequestParam(required = true, defaultValue = "1")Integer num2){

            Number sum = mathOperation.add(num1,num2);
            //Number number =new Number();
            //number.setValue(sum);

        return  sum;
    }


    @GetMapping("/subtract")
    public Number subtract(
            @RequestParam(required = true, defaultValue = "2")Integer num1,
            @RequestParam(required = true, defaultValue = "1")Integer num2){
        Number subt = mathOperation.subtract(num1,num2);
         return subt;
    }



}
