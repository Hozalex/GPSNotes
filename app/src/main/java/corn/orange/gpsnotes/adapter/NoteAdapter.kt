package corn.orange.gpsnotes.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import corn.orange.gpsnotes.R
import corn.orange.gpsnotes.model.Note

class NoteAdapter(private val notesArrayList: ArrayList<Note>, private var onNoteClickListener: OnNoteClickListener)
    : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>()
{

    val TAG = "NoteAdapter"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder
    {
        val viewHolder = NoteViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.card, parent, false) as CardView)
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
        val cardView = viewHolder.cardView
        cardView.findViewById<TextView>(R.id.tvNoteTitle).text = notesArrayList[position].getTitle()
        cardView.findViewById<TextView>(R.id.tvNote).text = notesArrayList[position].getContent()
        Log.d(TAG, notesArrayList[position].getTitle() + " " + notesArrayList[position].getContent())
    }


    class NoteViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView)
    {
    }


    interface OnNoteClickListener
    {
        fun onNoteClick(notePosition: Int)

    }
}