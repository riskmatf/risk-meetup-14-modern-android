package rs.ac.bg.matf.risk.risknotes.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

@Dao
interface NoteDao {

    @Update
    fun update(note: Note)

    @Insert
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("SELECT * FROM Note")
    fun selectAll(): LiveData<List<Note>>

}