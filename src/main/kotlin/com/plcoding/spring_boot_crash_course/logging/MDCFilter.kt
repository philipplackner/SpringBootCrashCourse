package com.plcoding.spring_boot_crash_course.logging

import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import org.slf4j.MDC
import org.springframework.security.core.context.SecurityContextHolder

class MDCFilter: Filter {

    override fun doFilter(
        request: ServletRequest?,
        response: ServletResponse?,
        chain: FilterChain?
    ) {
        try {
            val userId = SecurityContextHolder.getContext().authentication.principal as String
            MDC.put("userId", userId)
            chain?.doFilter(request, response)
        } finally {
            MDC.clear()
        }
    }
}