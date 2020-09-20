package io.yeongcheon.playground.springboot.exception

class CustomException(message: String?): Exception(message) {
    constructor(e: Exception): this(message = e.message)
}