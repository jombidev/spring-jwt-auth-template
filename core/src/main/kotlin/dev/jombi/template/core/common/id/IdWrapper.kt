package dev.jombi.template.core.common.id

import org.springframework.data.jpa.repository.JpaRepository
import kotlin.jvm.optionals.getOrNull

sealed interface IdWrapper<ID : Any> {
    val id: ID
    fun <T : Any> fetch(repository: JpaRepository<T, ID>) = repository.findById(id).getOrNull()
}
