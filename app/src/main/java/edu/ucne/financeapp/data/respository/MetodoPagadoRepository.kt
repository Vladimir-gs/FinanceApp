package edu.ucne.financeapp.data.respository

import edu.ucne.financeapp.data.local.dao.MetodoPagoDao
import edu.ucne.financeapp.data.local.entity.MetodoPagadoEntity
import javax.inject.Inject

class MetodoPagadoRepository @Inject constructor(
    private val metodoPagadoDao: MetodoPagoDao
){
    suspend fun save(metodoPago: MetodoPagadoEntity) = metodoPagadoDao.save(metodoPago)
    suspend fun delete(metodoPago: MetodoPagadoEntity) = metodoPagadoDao.delete(metodoPago)
    suspend fun find(metodoPagoId: Int) = metodoPagadoDao.find(metodoPagoId)
    fun getAll() = metodoPagadoDao.getAll()
}