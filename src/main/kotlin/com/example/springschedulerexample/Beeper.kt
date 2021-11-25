package com.example.springschedulerexample

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Beeper {
    @Scheduled(fixedDelay = 1000)
    fun beep() {
        println("beep!!!")
    }

    @Scheduled(cron = "* * * * * *")
    fun ping() {
        println("ping!!!")
    }

    @Scheduled(cron = "* * * * * *")
    fun pong() {
        var message = ""
        message = "pong!!!"
        println(message)
    }

}