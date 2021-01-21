package com.yaseka.superkahramanolusturucu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }
    fun SuperKahramanYap(view: View){
        val isim=isimText.text.toString();
        val yas=yasText.text.toString().toIntOrNull();
        val meslek=meslekText.text.toString();

        if (yas==null){
            sonucText.text="Yaş için Doğru Bir Değer Giriniz";
        }
        else{
            val superKahraman=SuperKahraman(isim,yas,meslek);
            sonucText.text="İsim: ${superKahraman.isim}  Yaş: ${superKahraman.yas}  Meslek: ${superKahraman.meslek}";
        }



    }
}