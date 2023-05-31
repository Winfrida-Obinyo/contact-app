package com.winnie.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.winnie.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContact()
    }
    fun showContact(){
        val contact1=ContactData("Cynthia Faith","0734672838","faithnahdy@gmail.com")
        val contact2=ContactData("Regina Destiny","0734672838","reginadestiny@gmail.com")
        val contact3=ContactData("Rebeccah Blessings","0734672838","rebeccahblessings@gmail.com")
        val contact4=ContactData("Winfrida Happy","0734672838","winfridahappy@gmail.com")
        val contact5=ContactData("Deborah Love","0734672838","deborahappy@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter

    }

}