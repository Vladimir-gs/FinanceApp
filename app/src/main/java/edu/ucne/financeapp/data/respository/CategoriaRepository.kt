package edu.ucne.financeapp.data.respository

import edu.ucne.financeapp.data.local.dao.CategoriaDao
import edu.ucne.financeapp.data.local.entity.CategoriaEntity
import javax.inject.Inject

class CategoriaRepository @Inject constructor(
    private val categoriaDao: CategoriaDao
){
    suspend fun save(categoria: CategoriaEntity) = categoriaDao.save(categoria)
    suspend fun delete(categoria: CategoriaEntity) = categoriaDao.delete(categoria)
    suspend fun find(categoriaId: Int) = categoriaDao.find(categoriaId)
    fun getAll() = categoriaDao.getAll()
}
