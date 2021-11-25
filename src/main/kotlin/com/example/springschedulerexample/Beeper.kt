package com.example.springschedulerexample

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Beeper {
    @Scheduled(fixedDelay = 1000)
    fun beep() {
        var message = "beep !!!"
        println(message)
    }

    @Scheduled(cron = "* * * * * *")
    fun ping() {
        println("ping!!!")
    }
}