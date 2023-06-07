package com.example.kotlin.chat.controller

import com.example.kotlin.chat.service.MessageService
import com.example.kotlin.chat.service.MessageVM
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set

/**
 * @title: HtmlController
 * @description: TODO
 * @author Kevin-Cui
 * @date 2023/5/26 15:33
 */
@Controller
class HtmlController (val messageService: MessageService){

    @GetMapping("/")
    fun index(): String {
        // implemented in src/main/resources/templates/chatrs.html
        return "chatrs"
    }
}