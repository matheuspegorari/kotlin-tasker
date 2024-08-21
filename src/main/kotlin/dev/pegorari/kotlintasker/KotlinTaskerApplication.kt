package dev.pegorari.kotlintasker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTaskerApplication

fun main(args: Array<String>) {
    runApplication<KotlinTaskerApplication>(*args)
}
