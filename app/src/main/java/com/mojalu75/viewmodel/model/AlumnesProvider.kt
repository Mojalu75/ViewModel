package com.mojalu75.viewmodel.model

class AlumnesProvider {
    companion object {
        fun random(): AlumnesModel {
            val position = (0..10).random()
            return alumnes[position]
        }

        private val alumnes = listOf<AlumnesModel>(
            AlumnesModel(nombre = "Marc", edat = 18),
            AlumnesModel(nombre = "Laura", edat = 22),
            AlumnesModel(nombre = "Jordi", edat = 19),
            AlumnesModel(nombre = "Marta", edat = 20),
            AlumnesModel(nombre = "Pau", edat = 21),
            AlumnesModel(nombre = "Elena", edat = 23)
        )
    }
}