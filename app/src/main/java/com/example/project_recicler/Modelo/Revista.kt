package com.example.project_recicler.Modelo

class Revista {
    var journal_id:Int
    var portada:String
    var abreviacion:String
    var descripcion:String
    var journalThumbnail:String
    var nombre:String

    constructor(
        journal_id: Int,
        portada: String,
        abreviacion: String,
        descripcion: String,
        journalThumbnail:String,
        nombre: String
    ) {
        this.journal_id = journal_id
        this.portada = portada
        this.abreviacion = abreviacion
        this.descripcion = descripcion

        this.journalThumbnail=journalThumbnail
        this.nombre = nombre
    }
}