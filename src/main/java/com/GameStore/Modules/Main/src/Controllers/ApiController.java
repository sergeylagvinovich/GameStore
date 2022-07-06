package com.GameStore.Modules.Main.src.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("webApi/administration")
public class ApiController {

    @GetMapping
    public ArrayList<Map<String,String>> getGames(){
        ArrayList<Map<String,String>> sss = new ArrayList<> (){{
            add (new HashMap<> (){{
                put ("id","id");
                put ("name","name");
                put ("key","key");
            }});
            add (new HashMap<> (){{
                put ("id","id1");
                put ("name","name1");
                put ("key","key1");
            }});
            add (new HashMap<> (){{
                put ("id","id2");
                put ("name","name2");
                put ("key","key2");
            }});
        }};
        return sss;
    }
}
