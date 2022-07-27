package com.dilara.roomkotlin

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {//veri erişim nesnesi
@Insert
fun insert(student: Student)

    @Delete
    fun delete(student: Student)

    @Query("SELECT*FROM student")
    fun getAllStudent(): List<Student>
}