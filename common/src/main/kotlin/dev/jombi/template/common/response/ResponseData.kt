package dev.jombi.template.common.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

data class ResponseData<T>(override val code: String, override val status: Int, val data: T) : BaseResponse {
    companion object {
        fun <T> of(message: String, code: HttpStatus, data: T) =
            ResponseEntity.status(code).body(ResponseData(message, code.value(), data))
        fun <T> ok(message: String = "OK", data: T) = of(message, HttpStatus.OK, data)
        fun <T> created(message: String = "Created", data: T) = of(message, HttpStatus.CREATED, data)
    }
}
