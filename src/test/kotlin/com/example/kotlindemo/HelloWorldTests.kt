package com.example.kotlindemo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest(HelloWorld::class)
class HelloWorldTests {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun testSayHello() {
        mockMvc.get("/hello").andExpect {
            status { isOk() }
            content { string("Hello") }
        }
    }
}
