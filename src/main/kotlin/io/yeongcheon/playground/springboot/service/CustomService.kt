package io.yeongcheon.playground.springboot.service

import io.yeongcheon.playground.springboot.exception.CustomException
import io.yeongcheon.playground.springboot.model.CustomModel
import io.yeongcheon.playground.springboot.repository.CustomRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
@Component
class CustomService {
    @Autowired
    private lateinit var customRepository: CustomRepository

    @Throws(CustomException::class) // Throws annotation에 CustomException을 추가해줍니다.
    fun add(): CustomModel {
        this.customRepository.save(CustomModel(name="customName")) // 이제 롤백되지 않습니다!
        throw CustomException("must not rollback")
    }
}