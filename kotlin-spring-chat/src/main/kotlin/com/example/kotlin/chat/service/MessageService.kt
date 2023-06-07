package com.example.kotlin.chat.service

import kotlinx.coroutines.flow.Flow

/**
 * @title: MessageService
 * @description: TODO
 * @author Kevin-Cui
 * @date 2023/5/26 15:23
 */
interface MessageService {

    fun latest(): Flow<MessageVM>

    fun after(messageId: String): Flow<MessageVM>

    fun stream(): Flow<MessageVM>

    suspend fun post(messages: Flow<MessageVM>)
}