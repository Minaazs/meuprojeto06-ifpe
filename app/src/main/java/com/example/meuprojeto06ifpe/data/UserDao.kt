package com.example.meuprojeto06ifpe.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.meuprojeto06ifpe.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insert(user: User)
}
