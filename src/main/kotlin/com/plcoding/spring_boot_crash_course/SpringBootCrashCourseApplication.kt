package com.plcoding.spring_boot_crash_course

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCrashCourseApplication

fun main(args: Array<String>) {
	runApplication<SpringBootCrashCourseApplication>(*args)
}
