package com.GameStore.Modules.Main.src;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gameStore/**")
public class MainController {

    @GetMapping
    public String index(){
        return "main";
    }

}
