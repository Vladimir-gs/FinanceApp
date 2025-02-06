package edu.ucne.financeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.financeapp.data.local.entity.MetodoPagadoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MetodoPagoDao {
    @Upsert
    suspend fun save(metodoPago: MetodoPagadoEntity)

    @Delete
    suspend fun delete(metodoPago: MetodoPagadoEntity)

    @Query("""
        Select *
        From MetodoPago
        Where metodoPagadoId = :metodoPagoId
        Limit 1
    """)
    suspend fun find(metodoPagoId: Int): MetodoPagadoEntity

    @Query("Select * From MetodoPago")
    fun getAll(): Flow<List<MetodoPagadoEntity>>
}