package dev.jombi.template.core.member.entity

import dev.jombi.template.core.common.entity.BaseTimeEntity
import dev.jombi.template.core.common.id.WrappedLong
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "tb_member")
data class Member(
    @Column(unique = true, nullable = false)
    val credential: String,

    @Column(nullable = false)
    val password: String, // bcrypt

    @Column(nullable = false)
    val name: String,

    @Id
    val id: WrappedLong = WrappedLong.NULL
) : BaseTimeEntity()
