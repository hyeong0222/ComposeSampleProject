package com.example.composesampleproject.ui.profile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.composesampleproject.data.model.Puppy
import com.example.composesampleproject.ui.MainContent
import com.example.composesampleproject.ui.theme.ComposeSampleProjectTheme

class ProfileActivity : AppCompatActivity() {

    private val puppy: Puppy by lazy {
        intent?.getSerializableExtra(PUPPY_ID) as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleProjectTheme {
                Profile(puppy)
            }
        }
    }

    companion object {
        private const val PUPPY_ID = "puppy_id"
        fun newIntent(context: Context, puppy: Puppy) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(PUPPY_ID, puppy)
            }
    }
}

@Composable
fun Profile(puppy: Puppy) {
    Scaffold(
        content = {
            ProfileScreen(puppy = puppy)
        }
    )
}