package com.allovoisins.appcontacts

import android.app.ProgressDialog
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.loader.app.LoaderManager

class MainActivity : AppCompatActivity() {

    lateinit var contact_lisview:ListView
    lateinit var arrayList:ArrayList<ContactModel>
    lateinit var adapter:Contact_Adapter

    lateinit var pd:ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contact_lisview = findViewById(R.id.contact_listview)
    }

    private class LoadContacts:AsyncTask<Void,Void,Void>{

        override fun doInBackground(vararg p0: Void?): Void {
            arra
        }
    }
}
