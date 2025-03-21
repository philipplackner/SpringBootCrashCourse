package com.plcoding.spring_boot_crash_course

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCrashCourseApplication

fun main(args: Array<String>) {
	runApplication<SpringBootCrashCourseApplication>(*args)
}
