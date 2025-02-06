package edu.ucne.financeapp.data.respository

import edu.ucne.financeapp.data.local.dao.PresupuestoDao
import edu.ucne.financeapp.data.local.entity.PresupuestoEntity
import javax.inject.Inject

class PresupuestoRepository @Inject constructor(
    private val presupuestoDao: PresupuestoDao
) {
    suspend fun save(presupuesto: PresupuestoEntity) = presupuestoDao.save(presupuesto)
    suspend fun delete(presupuesto: PresupuestoEntity) = presupuestoDao.delete(presupuesto)
    suspend fun find(presupuestoId: Int) = presupuestoDao.find(presupuestoId)
    fun getAll() = presupuestoDao.getAll()

}