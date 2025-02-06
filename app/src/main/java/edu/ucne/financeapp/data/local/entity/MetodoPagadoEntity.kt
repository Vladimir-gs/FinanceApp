package edu.ucne.financeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MetodoPago")
data class MetodoPagadoEntity (
    @PrimaryKey()
    val metodoPagadoId: Int? = null,
    val nombre: String = "",
)
