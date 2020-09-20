package io.yeongcheon.playground.springboot.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "custom")
class CustomModel(
    @get:Id
    @get:Column(length = 50, updatable = false)
    var name: String = ""
)