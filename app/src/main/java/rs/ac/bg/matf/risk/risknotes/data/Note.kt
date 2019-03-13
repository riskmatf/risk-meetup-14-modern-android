package rs.ac.bg.matf.risk.risknotes.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Note(
    var title: String,
    var content: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
)