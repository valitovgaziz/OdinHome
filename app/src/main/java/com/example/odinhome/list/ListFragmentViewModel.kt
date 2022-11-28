package com.example.odinhome.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.odinhome.room.DbConnection
import com.example.odinhome.room.InfoCardData
import kotlinx.coroutines.launch

class ListFragmentViewModel(application: Application) : AndroidViewModel(application) {

    private val infoCardDao =
        Room.databaseBuilder(application, DbConnection::class.java, "database")
            .build()
            .entityDao()

    val list = infoCardDao.getAll()

    fun insert(infoCardData: InfoCardData) {
        viewModelScope.launch {
            infoCardDao.insert(infoCardData)
        }
    }

}