package com.example.kotlin.chat.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

/**
 * @title: DomainModel
 * @description: TODO
 * @author Kevin-Cui
 * @date 2023/5/26 16:07
 */
@Table("MESSAGES")
data class Message(
    val content: String,
    val contentType: ContentType,
    val sent: Instant,
    val username: String,
    val userAvatarImageLink: String,
    @Id var id: String? = null)

enum class ContentType {
    PLAIN,MARKDOWN
}