package com.example.playground;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("numbers")
public class OddController {
    @GetMapping("/odd")
    @ResponseBody
    public boolean isOdd(@RequestParam int number) {
        return number%2 == 0;
    }
}
