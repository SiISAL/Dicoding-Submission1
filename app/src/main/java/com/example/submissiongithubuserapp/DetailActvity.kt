package com.example.submissiongithubuserapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActvity : AppCompatActivity(){

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvObject:TextView = findViewById(R.id.tv_object_received)

        val user = intent.getParcelableArrayExtra(EXTRA_USER) as User
        val text = "Avatar : ${user.avatar},\nName : ${user.name.toString()},\nUsername : ${user.username},\nLocation : ${user.location},\nRepository : ${user.repository},\nCompany : ${user.company},\nFollowers : ${user.followers},\nFollowing : ${user.following}"
        tvObject.text = text
    }
}