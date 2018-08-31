package corn.orange.gpsnotes.DAO

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import corn.orange.gpsnotes.model.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class NoteDataBase : RoomDatabase()
{
}