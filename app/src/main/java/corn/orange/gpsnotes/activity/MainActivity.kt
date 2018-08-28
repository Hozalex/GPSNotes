package corn.orange.gpsnotes.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.LinearLayoutManager
import corn.orange.gpsnotes.R
import corn.orange.gpsnotes.adapter.NoteAdapter
import corn.orange.gpsnotes.adapter.NoteAdapter.OnNoteClickListener
import corn.orange.gpsnotes.model.Note
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.item_note.*

class MainActivity : AppCompatActivity()
{

    private lateinit var notesArrayList: ArrayList<Note>
    private lateinit var note: Note

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNotes.setHasFixedSize(true)
        rvNotes.layoutManager = LinearLayoutManager(this)
        notesArrayList = ArrayList(10)
        setSupportActionBar(toolbar)
        initActionBar()
        rvNotes.adapter = NoteAdapter(notesArrayList, object : OnNoteClickListener
        {
            override fun onNoteClick(notePosition: Int)
            {
                tvNote.editableText
                tvNoteDescription.editableText
            }
        })

    }

    private fun initActionBar()
    {
        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.open, R.string.close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
    }
}
