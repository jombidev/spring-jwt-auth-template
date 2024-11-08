package dev.jombi.template.common.response

sealed interface BaseResponse {
    val code: String
    val status: Int
}
