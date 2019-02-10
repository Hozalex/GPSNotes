package corn.orange.notes

import android.app.Application
import corn.orange.notes.model.dao.NoteDataBase

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        NoteDataBase.getDatabase(applicationContext)

    }


}