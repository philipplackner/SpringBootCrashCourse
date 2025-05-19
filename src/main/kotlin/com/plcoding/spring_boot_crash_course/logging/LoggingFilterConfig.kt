package com.plcoding.spring_boot_crash_course.logging

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoggingFilterConfig {

    @Bean
    fun loggingFilter(): FilterRegistrationBean<MDCFilter> {
        return FilterRegistrationBean<MDCFilter>().apply {
            filter = MDCFilter()
            addUrlPatterns("/*")
        }
    }
}