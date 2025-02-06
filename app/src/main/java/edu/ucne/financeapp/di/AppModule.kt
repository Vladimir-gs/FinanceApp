package edu.ucne.financeapp.di

import edu.ucne.financeapp.data.local.database.AppDatabase

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context) =
        Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "FinanceApp.db"
        ).fallbackToDestructiveMigration()
            .build()
    @Provides
    @Singleton
    fun provideTransactionDao(appDatabase: AppDatabase) = appDatabase.trasnsaccionDao()
    @Provides
    @Singleton
    fun provideCategoriaDao(appDatabase: AppDatabase) = appDatabase.categoriaDao()
    @Provides
    @Singleton
    fun provideMetodoPagoDao(appDatabase: AppDatabase) = appDatabase.metodoPagoDao()
    @Provides
    @Singleton
    fun providePresupuestoDao(appDatabase: AppDatabase) = appDatabase.presupuestoDao()
}