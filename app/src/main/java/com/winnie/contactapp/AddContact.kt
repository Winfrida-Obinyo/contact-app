package com.winnie.contactapp

// Inside AddContactActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.winnie.contactapp.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            saveContact()
        }
    }

    private fun saveContact() {
        // Retrieve input data from UI fields
        val name = binding.etName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val emailAddress = binding.etEmailAddress.text.toString()
        val avatarUrl = binding.etAvatarUrl.text.toString()

        // Perform validation on the input data
        if (name.isNotEmpty() && phoneNumber.isNotEmpty() && emailAddress.isNotEmpty()) {
            // Create a new ContactData object with the input data
            val newContact = ContactData(name, phoneNumber, emailAddress, avatarUrl)

            // TODO: Save the new contact to the database or any desired storage

            // Finish the activity and return to the MainActivity
            finish()
        } else {
            // Display an error message or toast indicating incomplete input
            // You can use Toast.makeText() to display a toast message.
        }
    }
}
