package com.example.odinhome.room


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [InfoCardData::class], version = 1)
abstract class DbConnection : RoomDatabase() {
    abstract fun entityDao(): InfoCardDao
}