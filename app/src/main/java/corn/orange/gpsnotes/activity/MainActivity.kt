package corn.orange.gpsnotes.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import corn.orange.gpsnotes.R
import corn.orange.gpsnotes.adapter.NoteAdapter
import corn.orange.gpsnotes.fragment.NoteFragment
import corn.orange.gpsnotes.model.Note
import kotlinx.android.synthetic.main.app_bar.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main.view.*

class MainActivity : AppCompatActivity()
{

    private lateinit var notesArrayList: ArrayList<Note>
    private lateinit var noteAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var note: Note
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        notesArrayList = ArrayList(10)
        notesArrayList.add(Note("First Note", "Hello World"))
        Log.d(TAG, notesArrayList[0].getTitle() + " " + notesArrayList[0].getContent())
        setSupportActionBar(my_toolbar)
        addAdapter()

    }

    private fun addAdapter()
    {
//        viewManager = LinearLayoutManager(applicationContext)
//        noteAdapter = NoteAdapter(notesArrayList, object : NoteAdapter.OnNoteClickListener
//        {
//            override fun onNoteClick(notePosition: Int)
//            {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        })
//        val recyclerView = findViewById<RecyclerView>(R.id.rvNotes).apply {
//            setHasFixedSize(true)
//            layoutManager = viewManager
//            adapter = noteAdapter
//        }

        rvNotes.adapter = NoteAdapter(notesArrayList, object : NoteAdapter.OnNoteClickListener
        {
            override fun onNoteClick(notePosition: Int)
            {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        rvNotes.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(rvNotes.context)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean
    {
        when (item?.itemId)
        {
            R.id.menu_add_note -> Toast.makeText(this, "add note", Toast.LENGTH_SHORT).show()
            R.id.menu_clear_note -> Toast.makeText(this, "add clear note", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}
