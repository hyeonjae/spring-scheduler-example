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
        var message = ""
        message = "ping!!!"
        println(message)
    }
}