package edu.ucne.financeapp.data.respository

import edu.ucne.financeapp.data.local.dao.TransaccionDao
import edu.ucne.financeapp.data.local.entity.TransactionEntity
import javax.inject.Inject

class TransaccionRepository @Inject constructor(
    private val transactionDao: TransaccionDao
){
    suspend fun save(transaction: TransactionEntity) = transactionDao.save(transaction)
    suspend fun delete(transaction: TransactionEntity) = transactionDao.delete(transaction)
    suspend fun find(transactionId: Int) = transactionDao.find(transactionId)
    fun getAll() = transactionDao.getAll()
}