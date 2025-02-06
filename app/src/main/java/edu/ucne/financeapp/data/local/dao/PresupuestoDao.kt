package edu.ucne.financeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.financeapp.data.local.entity.PresupuestoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PresupuestoDao {
    @Upsert
    suspend fun save(presupuesto: PresupuestoEntity)

    @Delete
    suspend fun delete(presupuesto: PresupuestoEntity)

    @Query(
        """
        Select *
        From Presupuesto
        Where presupuestoId = :presupuestoId
        Limit 1
    """
    )
    suspend fun find(presupuestoId: Int): PresupuestoEntity

    @Query("Select * From Presupuesto")
    fun getAll(): Flow<List<PresupuestoEntity>>
}