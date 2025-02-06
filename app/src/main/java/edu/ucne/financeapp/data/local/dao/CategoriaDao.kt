package edu.ucne.financeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.financeapp.data.local.entity.CategoriaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoriaDao {
    @Upsert
    suspend fun save(categoria: CategoriaEntity)

    @Delete
    suspend fun delete(categoria: CategoriaEntity)

    @Query(
        """
        Select *
        From Categoria
        Where categoriaId = :categoriaId
        Limit 1
    """
    )
    suspend fun find(categoriaId: Int): CategoriaEntity

    @Query("Select * From Categoria")
    fun getAll(): Flow<List<CategoriaEntity>>
}