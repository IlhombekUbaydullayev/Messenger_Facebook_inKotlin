package com.example.messenger_facebook_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_facebook_inkotlin.adapter.ChatAdapter
import com.example.messenger_facebook_inkotlin.model.Chat
import com.example.messenger_facebook_inkotlin.model.Message
import com.example.messenger_facebook_inkotlin.model.Room

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter

    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img19,"Ilhombek Ubaydullayev"))
        stories.add(Room(R.drawable.img20,"Laziz Ubaydullayev"))
        stories.add(Room(R.drawable.img21,"Amir Ubaydullayev"))
        stories.add(Room(R.drawable.img22,"Said Ubaydullayev"))
        stories.add(Room(R.drawable.img23,"Jamshid Ubaydullayev"))
        stories.add(Room(R.drawable.img24,"Begzod Ubaydullayev"))
        stories.add(Room(R.drawable.img25,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img21,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img22,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img23,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img24,"Abdulhay Ubaydullayev"))

        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.img19,"Ilhombek",false)))
        chats.add(Chat(Message(R.drawable.img20,"Maqsit",true)))
        chats.add(Chat(Message(R.drawable.img21,"Jamol",false)))
        chats.add(Chat(Message(R.drawable.img22,"Karim",true)))
        chats.add(Chat(Message(R.drawable.img23,"Leyla",false)))
        chats.add(Chat(Message(R.drawable.img24,"Amanda",true)))
        chats.add(Chat(Message(R.drawable.img25,"Alex",false)))
        chats.add(Chat(Message(R.drawable.img26,"Bahodir",true)))
        chats.add(Chat(Message(R.drawable.img21,"Olim",false)))
        chats.add(Chat(Message(R.drawable.img22,"Zayniddin",true)))
        chats.add(Chat(Message(R.drawable.img24,"Javohir",false)))
        chats.add(Chat(Message(R.drawable.img26,"Umit",true)))
        chats.add(Chat(Message(R.drawable.img22,"Zaynab",false)))
        chats.add(Chat(Message(R.drawable.img20,"Sherali",false)))

        return chats
    }
}