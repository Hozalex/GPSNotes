package corn.orange.simplenotes

import android.app.Application
import corn.orange.simplenotes.model.dao.NoteDataBase

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        NoteDataBase.getDatabase(applicationContext)

    }


}