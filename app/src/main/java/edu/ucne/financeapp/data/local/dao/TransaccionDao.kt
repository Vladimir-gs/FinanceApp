package edu.ucne.financeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.financeapp.data.local.entity.TransactionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TransaccionDao {

    @Upsert
    suspend fun save(transaction: TransactionEntity)

    @Delete
    suspend fun delete(transaction: TransactionEntity)

    @Query("""
        Select *
        From Transaccion
        Where transaccionId = :transactionId
        Limit 1
        """)
    suspend fun find(transactionId: Int): TransactionEntity

    @Query("Select * From Transaccion")
    fun getAll(): Flow<List<TransactionEntity>>
}