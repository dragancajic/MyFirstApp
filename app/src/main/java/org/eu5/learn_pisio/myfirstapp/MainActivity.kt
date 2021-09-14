package org.eu5.learn_pisio.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.eu5.learn_pisio.myfirstapp.utilities.StringUtility
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
	    
	    Toast.makeText(this, "This is branch 2.", Toast.LENGTH_LONG).show()
	    
	    // Version Control System (VCS): [Ctrl + D] for Git Diff (do a diff)
	    // Compare the current file to the older version of the file.
	    
	    val gson = GsonBuilder().create()
	    
	    val util = StringUtility() // constructor syntax
	    println(util.getAString())
	    // The println() function will actually output information in the Logcat window.
	    // And it'll attach a tag of System.out
    }
}