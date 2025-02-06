package edu.ucne.financeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Transaccion")
data class TransactionEntity(
    @PrimaryKey()
    val transaccionId: Int? = null,
    val monto: Double = 0.0,
    val fecha: Date? = null,
    val categoria: Int? = 0,
    val tipo: String = "",
    val descripcion: String = "",
    val metodoPagado: Int? = 0
)
