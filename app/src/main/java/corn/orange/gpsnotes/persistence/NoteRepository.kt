package corn.orange.gpsnotes.persistence

import android.app.Application
import android.arch.lifecycle.LiveData
import android.os.AsyncTask

class NoteRepository(application: Application)
{

    private val db = NoteDataBase.getInstance(application)
    private val mNoteDao = db?.noteDataDao()
    private var mAllNotes: LiveData<List<Note>> = mNoteDao?.getAll() as LiveData<List<Note>>

    fun getAllNotes(): LiveData<List<Note>>
    {
        return mAllNotes
    }

    fun insert(note: Note)
    {
        InsertAsync(mNoteDao!!).execute(note)
    }

    private class InsertAsync(private val noteDao: NoteDataDao) : AsyncTask<Note, Void, Void>()
    {

        override fun doInBackground(vararg p0: Note?): Void
        {

            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }


}

