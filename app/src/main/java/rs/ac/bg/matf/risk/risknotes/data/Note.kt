package rs.ac.bg.matf.risk.risknotes.data

import android.arch.persistence.room.Entity

@Entity
data class Note(var title: String, var content: String)