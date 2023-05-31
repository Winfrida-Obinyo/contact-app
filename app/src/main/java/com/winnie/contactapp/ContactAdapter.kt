package com.winnie.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.winnie.contactapp.databinding.ContactListItemBinding

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder {
        val binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvAllNames.text=currentContact.AllNames
        binding.tvphoneNumber.text =currentContact.phoneNumber
        binding.tvemailAddress.text=currentContact.emailAddress
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
    class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root)}