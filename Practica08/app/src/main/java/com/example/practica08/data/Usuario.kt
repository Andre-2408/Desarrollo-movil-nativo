package com.example.practica08.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Entidad: representa la tabla "usuarios" dentro de la base de datos
@Entity(tableName = "usuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String
)
