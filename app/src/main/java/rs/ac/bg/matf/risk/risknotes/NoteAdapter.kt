package rs.ac.bg.matf.risk.risknotes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import rs.ac.bg.matf.risk.risknotes.data.Note

class NoteAdapter(context: Context) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    private var allNotes = emptyList<Note>()

    fun setNotes(notes: List<Note>) {
        this.allNotes = notes
        notifyDataSetChanged()
    }


    override fun getItemCount() = allNotes.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = inflater.inflate(R.layout.note_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val currentItem = allNotes[position]

        viewHolder.noteTitle.text = currentItem.title
        viewHolder.noteContent.text = currentItem.content
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val noteTitle: TextView = itemView.findViewById(R.id.note_title)
        val noteContent: TextView = itemView.findViewById(R.id.note_content)
    }


}