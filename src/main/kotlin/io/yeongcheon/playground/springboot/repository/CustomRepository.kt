package io.yeongcheon.playground.springboot.repository

import io.yeongcheon.playground.springboot.model.CustomModel
import org.springframework.data.jpa.repository.JpaRepository

interface CustomRepository: JpaRepository<CustomModel, String> {
}