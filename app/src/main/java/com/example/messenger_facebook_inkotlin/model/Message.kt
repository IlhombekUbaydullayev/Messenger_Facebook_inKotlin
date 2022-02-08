package com.example.messenger_facebook_inkotlin.model

data class Message(var profile : Int, var fullname: String,var isOnline : Boolean = false) {
}