package com.example.kotlindemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

    @GetMapping("hello")
    fun sayHello(): String {
        return "Hello"
    }
}
