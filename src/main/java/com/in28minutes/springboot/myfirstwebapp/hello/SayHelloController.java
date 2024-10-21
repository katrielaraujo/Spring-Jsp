package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! ";
    }//http://localhost:8080/say-hello

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>My first HTML Page</title>
                </head>
                <body>
                    My first html page with body
                </body>
                </html>
                """;
    }
    // /src/main/resources/META-INF/resources/WEB-INF/jsp
    @GetMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
