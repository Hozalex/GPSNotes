package corn.orange.notes.model.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import corn.orange.notes.model.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class NoteDataBase : RoomDatabase()
{
}