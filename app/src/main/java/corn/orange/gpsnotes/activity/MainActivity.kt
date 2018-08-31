package corn.orange.gpsnotes.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import corn.orange.gpsnotes.R
import corn.orange.gpsnotes.R.id.menu_add_note
import corn.orange.gpsnotes.R.id.menu_clear_note
import corn.orange.gpsnotes.model.Note
import kotlinx.android.synthetic.main.app_bar.*

class MainActivity : AppCompatActivity()
{

    private lateinit var notesArrayList: ArrayList<Note>
    private lateinit var note: Note

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notesArrayList = ArrayList(10)

        setSupportActionBar(my_toolbar)
//        rvNotes.adapter = NoteAdapter(notesArrayList, object : OnNoteClickListener
//        {
//            override fun onNoteClick(notePosition: Int)
//            {
//            }
//        })
//        rvNotes.layoutManager = LinearLayoutManager(rvNotes.context)
//        rvNotes.setHasFixedSize(true)

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
            menu_add_note -> Toast(this).show()
            menu_clear_note -> Toast(this).show()
        }
        return super.onOptionsItemSelected(item)
    }


}
