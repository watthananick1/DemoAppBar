package com.example.demoappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menubar_item,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miAddContact-> Toast.makeText(this,"You click add contact", Toast.LENGTH_LONG).show()
            R.id.miFavorite-> Toast.makeText(this,"You click Favorite", Toast.LENGTH_LONG).show()
            R.id.miFeedback-> Toast.makeText(this,"You click Feed back", Toast.LENGTH_LONG).show()
            R.id.miSetting-> Toast.makeText(this,"You click Setting", Toast.LENGTH_LONG).show()
            R.id.miClose->finish()
        }
        return true
    }
}