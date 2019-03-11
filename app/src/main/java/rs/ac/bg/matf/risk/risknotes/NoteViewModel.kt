package rs.ac.bg.matf.risk.risknotes

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import rs.ac.bg.matf.risk.risknotes.data.Note
import rs.ac.bg.matf.risk.risknotes.data.NoteDatabase
import rs.ac.bg.matf.risk.risknotes.data.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository: NoteRepository
    val allNotes: LiveData<List<Note>>

    init {
        val noteDao = NoteDatabase.getDatabase(application).noteDao()
        noteRepository = NoteRepository(noteDao)
        allNotes = noteRepository.notes
    }

    fun insert(note: Note) {
        noteRepository.insert(note)
    }

}