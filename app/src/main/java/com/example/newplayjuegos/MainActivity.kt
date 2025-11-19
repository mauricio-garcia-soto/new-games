package com.example.newplayjuegos


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import android.view.Menu
import android.content.ClipData.Item
import android.view.MenuItem
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val jugador = findViewById(R.id.button2) as Button
        jugador.setOnClickListener{lanzarNewPlayer()}
    }
    private fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }
    public override fun onCreateOptionsMenu(menu:Menu): Boolean{
        getMenuInflater().inflate(R.menu.menu_main,menu)
        return true
    }
    public override fun onOptionsItemSelected(item:MenuItem): Boolean{
     var id = item.getItemId()
        if (id==R.id.action_buscar){
            Toast.makeText(this,"busqueda", Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
