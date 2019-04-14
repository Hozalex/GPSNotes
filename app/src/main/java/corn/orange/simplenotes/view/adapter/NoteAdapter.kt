package corn.orange.simplenotes.view.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import corn.orange.simplenotes.R
import corn.orange.simplenotes.model.Note

//adapter for RecyclerView
class NoteAdapter(private val notesArrayList: ArrayList<Note>, private var onNoteClickListener: OnNoteClickListener)
    : androidx.recyclerview.widget.RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    val TAG = "NoteAdapter"

    class NoteViewHolder(val cardView: androidx.cardview.widget.CardView) : androidx.recyclerview.widget.RecyclerView.ViewHolder(cardView)

    //create view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        //create noteViewHolder from card layout
        val viewHolder = NoteViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.card, parent, false) as androidx.cardview.widget.CardView)
        //set clickListener for viewHolder
        viewHolder.itemView.setOnClickListener {
            onNoteClickListener.onNoteClick(viewHolder.adapterPosition)
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return notesArrayList.size
    }

    //bind data from cardView to RecyclerView
    override fun onBindViewHolder(viewHolder: NoteViewHolder, position: Int) {
        val cardView = viewHolder.cardView
        cardView.findViewById<TextView>(R.id.tvNoteTitle).text = notesArrayList[position].title
        cardView.findViewById<TextView>(R.id.tvNote).text = notesArrayList[position].content
        Log.d(TAG, notesArrayList[position].title + " " + notesArrayList[position].content)
    }

    //interface for ClickListener
    interface OnNoteClickListener {
        fun onNoteClick(notePosition: Int)
    }
}