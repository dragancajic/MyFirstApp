package org.eu5.learn_pisio.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import org.eu5.learn_pisio.myfirstapp.utilities.StringUtility
import com.google.gson.GsonBuilder

const val TAG = "my_log_tag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
	    
	    // some examples of live templates in Android Studio 4 for use with Kotlin:
	    // ~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-
	    // toast + TAB -> Toast.makeText(, "", Toast.LENGTH_SHORT).show()
	    Toast.makeText(this, "a message", Toast.LENGTH_SHORT).show()
	    
	    // logi -> Log.i(TAG, "onCreate: ")
	    Log.i(TAG, "onCreate: a custom message")
	    // logd -> Log.d(TAG, "onCreate: ")
	    
	    Toast.makeText(this, "This is branch 2.", Toast.LENGTH_LONG).show()
	    
	    // > Android Studio 4.2.2
	    // ``````````````````````
	    // Version Control System (VCS): [Ctrl + D] for Git Diff (do a diff)
	    // Compare the current file to the older version of the file.
	    
	    // To work with JSON strings, that popular notation for representing
	    // structured data, use --> Gson or Moshi:
	    
	    // ~ Goodbye Gson👋, Hello Moshi🤗
	    // https://proandroiddev.com/goodbye-gson-hello-moshi-4e591116231e
	    val gson = GsonBuilder().create()
	    
	    // To fully test, try to compile application: Build -> Make Project (Ctrl+F9).
	    // The make operation happens really quickly in the background. If you don't
	    // see any errors, then, you know the dependency WORKED!
	    
	    val util = StringUtility() // constructor syntax
	    println(util.getAString())
	    // The println() function will actually output information in the Logcat window.
	    // And it'll attach a tag of System.out
    }
}