package corn.orange.notes.view.fragment

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import corn.orange.notes.R
import corn.orange.notes.view.adapter.NoteAdapter
import corn.orange.notes.model.Note

class NoteFragment : Fragment()
{
    private lateinit var notesArrayList: ArrayList<Note>
    private lateinit var note: Note

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        note = Note("First NOte", "Hello World")
        notesArrayList = ArrayList(10)
        notesArrayList.add(note)
        val noteRecycler: RecyclerView = inflater?.inflate(R.layout.content_main, container, false) as RecyclerView

        val noteAdapter = NoteAdapter(notesArrayList, object : NoteAdapter.OnNoteClickListener
        {
            override fun onNoteClick(notePosition: Int)
            {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

        noteRecycler.adapter = noteAdapter
        noteRecycler.layoutManager = LinearLayoutManager(activity)
        return noteRecycler
    }
}