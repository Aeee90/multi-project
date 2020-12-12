package aeee.example.api.controller

import aeee.example.core.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val messageService: MessageService
){

    @GetMapping("/hello")
    fun hello() = messageService.greeting()


}
