package edu.ucne.financeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Categoria")
data class CategoriaEntity(
    @PrimaryKey()
    val categoriaId: Int? = null,
    val nombre: String = "",
    val descripcion: String = ""
)