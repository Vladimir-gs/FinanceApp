package edu.ucne.financeapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import edu.ucne.financeapp.data.local.dao.CategoriaDao
import edu.ucne.financeapp.data.local.dao.MetodoPagoDao
import edu.ucne.financeapp.data.local.dao.PresupuestoDao
import edu.ucne.financeapp.data.local.dao.TransaccionDao
import edu.ucne.financeapp.data.local.entity.CategoriaEntity
import edu.ucne.financeapp.data.local.entity.MetodoPagadoEntity
import edu.ucne.financeapp.data.local.entity.PresupuestoEntity
import edu.ucne.financeapp.data.local.entity.TransactionEntity

@Database
    (
    entities = [
        TransactionEntity::class,
        CategoriaEntity::class,
        MetodoPagadoEntity::class,
        PresupuestoEntity::class
    ],
    version = 2,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun trasnsaccionDao(): TransaccionDao
    abstract fun categoriaDao(): CategoriaDao
    abstract fun metodoPagoDao(): MetodoPagoDao
    abstract fun presupuestoDao(): PresupuestoDao

    companion object
}