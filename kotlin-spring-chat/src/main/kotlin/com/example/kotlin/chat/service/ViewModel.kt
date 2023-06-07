package com.example.kotlin.chat.service

import java.net.URL
import java.time.Instant

/**
 * @title: ViewModel
 * @description: TODO
 * @author Kevin-Cui
 * @date 2023/5/26 15:22
 */
data class MessageVM(val content: String, val user: UserVM, val sent: Instant, val id: String? = null)

data class UserVM(val name: String, val avatarImageLink: URL)