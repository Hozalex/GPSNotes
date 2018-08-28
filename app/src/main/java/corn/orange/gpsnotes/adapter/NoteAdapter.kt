package corn.orange.gpsnotes.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import corn.orange.gpsnotes.R
import corn.orange.gpsnotes.model.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NoteAdapter(private val notesArrayList: ArrayList<Note>, private var onNoteClickListener: OnNoteClickListener) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder
    {
        val viewHolder = NoteViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_note, parent, false))
        viewHolder.itemView.setOnClickListener {
            onNoteClickListener.onNoteClick(viewHolder.adapterPosition)
        }
        return viewHolder
    }

    override fun getItemCount(): Int
    {
        return notesArrayList.size
    }

    override fun onBindViewHolder(viewHolder: NoteViewHolder, position: Int)
    {
        viewHolder.tvNoteDescription.text = (notesArrayList[position].title).toUpperCase()
        viewHolder.tvNote.text = (notesArrayList[position].content)
    }


    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val tvNote = itemView.tvNote!!
        val tvNoteDescription = itemView.tvNoteDescription!!
    }


    interface OnNoteClickListener
    {
        fun onNoteClick(notePosition: Int)

    }
}