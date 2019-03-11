package rs.ac.bg.matf.risk.risknotes

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditNoteActivity : AppCompatActivity() {

    private lateinit var editTextTitle: EditText
    private lateinit var editTextContent: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_note)

        editTextTitle = findViewById(R.id.edit_note_title)
        editTextContent = findViewById(R.id.edit_note_content)

        saveButton = findViewById(R.id.save_button)

        saveButton.setOnClickListener {
            val replyIntent = Intent()

            val title = editTextTitle.text.toString()
            val content = editTextContent.text.toString()

            replyIntent.putExtra(EXTRA_TITLE, title)
            replyIntent.putExtra(EXTRA_CONTENT, content)

            setResult(Activity.RESULT_OK, replyIntent)
            finish()
        }

    }

    companion object {
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_CONTENT = "EXTRA_CONTENT"
    }
}
