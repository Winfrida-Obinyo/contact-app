

package com.winnie.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.winnie.contactapp.databinding.ActivityMainBinding
import android.content.Intent
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showContact()
        val fabAddContact: FloatingActionButton = findViewById(R.id.fabAddContact)
        fabAddContact.setOnClickListener {
            val intent = Intent(this@MainActivity, AddContact::class.java)
            startActivity(intent)
        }
    }

    private fun showContact() {
        val contact1 = ContactData(
            "Cynthia Faith",
            "0734672838",
            "faithnahdy@gmail.com",
            "https://media.istockphoto.com/id/1381221247/photo/beautiful-afro-girl-with-curly-hairstyle.webp?b=1&s=170667a&w=0&k=20&c=0x91osZOkL8EfhTEEGNa2EeCGN2gdMTNULOsUFW_0i4="
        )
        val contact2 = ContactData(
            "Regina Destiny",
            "0734672838",
            "reginadestiny@gmail.com",
            "https://media.istockphoto.com/id/1437816897/photo/business-woman-manager-or-human-resources-portrait-for-career-success-company-we-are-hiring.webp?b=1&s=170667a&w=0&k=20&c=YQ_j83pg9fB-HWOd1Qur3_kBmG_ot_hZty8pvoFkr6A="
        )
        val contact3 = ContactData(
            "Rebeccah Blessings",
            "0734672838",
            "rebeccahblessings@gmail.com",
            "https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.webp?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W33o3q3aW9CiAWEvv9XrJQ3fTMU="
        )
        val contact4 = ContactData(
            "Winfrida Happy",
            "0734672838",
            "winfridahappy@gmail.com",
            "https://media.istockphoto.com/id/938709362/photo/portrait-of-a-girl.webp?b=1&s=170667a&w=0&k=20&c=Qq2UW3DlJ6ye19GLHmc66Kxld9Z7D_r1o-KN7FJArKw="
        )
        val contact5 = ContactData(
            "Deborah Love",
            "0734672838",
            "deborahappy@gmail.com",
            "https://media.istockphoto.com/id/938709362/photo/portrait-of-a-girl.webp?b=1&s=170667a&w=0&k=20&c=Qq2UW3DlJ6ye19GLHmc66Kxld9Z7D_r1o-KN7FJArKw="
                   
        )
        val contactList = listOf(contact1, contact2, contact3, contact4, contact5)
        val contactAdapter = ContactAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contactAdapter
    }
}