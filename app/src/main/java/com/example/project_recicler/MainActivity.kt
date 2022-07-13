package com.example.project_recicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.project_recicler.Modelo.Revista
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.txt_nose)
        val cola = Volley.newRequestQueue(this)
        val url = "https://revistas.uteq.edu.ec/ws/journals.php"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                var jsonRevista=Gson()
                try {
                    var revista:Revista=jsonRevista.fromJson(response,Revista::class.java)
                    println("Hola")
                    //textView.text =revista.toString()
                } catch (e: Exception) {
                    textView.text = "Error----> ${response.toString()}"
                }
                //textView.text = "Resultado----> ${response.toString()}"
            },
            Response.ErrorListener { textView.text = "Ocurrio un error!" })
        cola.add(stringRequest)
    }
    fun eventEnviar(view: View){


    }
}