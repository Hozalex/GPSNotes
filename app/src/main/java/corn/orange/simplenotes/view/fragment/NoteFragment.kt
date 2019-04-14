package corn.orange.simplenotes.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import corn.orange.simplenotes.R
import corn.orange.simplenotes.view.adapter.NoteAdapter
import corn.orange.simplenotes.model.Note

class NoteFragment : androidx.fragment.app.Fragment() {
    private lateinit var notesArrayList: ArrayList<Note>
    private lateinit var note: Note

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        note = Note("First NOte", "Hello World")
        notesArrayList = ArrayList(10)
        notesArrayList.add(note)
        val noteRecycler: androidx.recyclerview.widget.RecyclerView = inflater?.inflate(R.layout.content_main, container, false) as androidx.recyclerview.widget.RecyclerView

        val noteAdapter = NoteAdapter(notesArrayList, object : NoteAdapter.OnNoteClickListener {
            override fun onNoteClick(notePosition: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

        noteRecycler.adapter = noteAdapter
        noteRecycler.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        return noteRecycler
    }

}