package com.plcoding.composepaging3caching.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDatabase: RoomDatabase() {

    abstract val dao: BeerDao
}