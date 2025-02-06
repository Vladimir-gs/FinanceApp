package edu.ucne.financeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Presupuesto")
class PresupuestoEntity(
    @PrimaryKey()
    val presupuestoId: Int? = null,
    val categoria: Int? = 0,
    val limite: Double = 0.0,
    val fechaInicio: Date? = null,
    val fechaFin: Date? = null,
)