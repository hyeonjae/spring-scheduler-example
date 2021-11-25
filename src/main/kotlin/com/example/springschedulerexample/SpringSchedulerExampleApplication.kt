package com.example.springschedulerexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class SpringSchedulerExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringSchedulerExampleApplication>(*args)
}
