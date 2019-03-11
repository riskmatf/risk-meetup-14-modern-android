package rs.ac.bg.matf.risk.risknotes.data

import android.arch.lifecycle.LiveData
import android.os.AsyncTask

class NoteRepository(private val noteDao: NoteDao) {

    val notes: LiveData<List<Note>> = noteDao.selectAll()
    // val -> final Object ...
    // var -> Object

    fun insert(note: Note) {
        InsertAsyncTask(noteDao).execute(note)
    }

    class InsertAsyncTask(private val noteDao: NoteDao) : AsyncTask<Note, Unit, Unit>() {

        override fun doInBackground(vararg params: Note) {
            noteDao.insert(params[0])
        }

    }



}