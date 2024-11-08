package dev.jombi.template.common.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@Suppress("unused")
data class ResponseEmpty(override val code: String, override val status: Int) : BaseResponse {
    companion object {
        fun of(message: String, code: HttpStatus) =
            ResponseEntity.status(code).body(ResponseEmpty(message, code.value()))
        fun ok(message: String = "OK") = of(message, HttpStatus.OK)
        fun created(message: String = "Created") = of(message, HttpStatus.CREATED)
        fun noContent() = ResponseEntity.noContent().build<ResponseEmpty>() // no body :)
    }
}
