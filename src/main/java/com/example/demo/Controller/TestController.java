package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")

public class TestController {

    // 특정값 출력
    @RequestMapping(value = "/TestPage", method = RequestMethod.GET)
    public String getHello() {
        return "Test Page";
    }

    // input 된거를 var로 정의 후 출력
    @GetMapping(value = "/{input}")
    public String getInput(@PathVariable("input") String var) {
        return var;
    }
}
