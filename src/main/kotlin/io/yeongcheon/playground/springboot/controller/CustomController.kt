package io.yeongcheon.playground.springboot.controller

import io.yeongcheon.playground.springboot.exception.CustomException
import io.yeongcheon.playground.springboot.service.CustomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/{version}/custom")
@Transactional
class CustomController {
    @Autowired
    private lateinit var customService: CustomService

    @PostMapping("")
    @Throws(CustomException::class) // Throws annotation에 CustomException을 추가해줍니다.
    fun addCustom(
    ) {
        this.customService.add()
    }
}