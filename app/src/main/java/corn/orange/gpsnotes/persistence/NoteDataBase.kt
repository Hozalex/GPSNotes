package corn.orange.gpsnotes.persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase : RoomDatabase()
{
    abstract fun noteDataDao(): NoteDataDao

    companion object
    {
        private var INSTANCE: NoteDataBase? = null

        fun getInstance(context: Context): NoteDataBase?
        {
            if (INSTANCE == null)
            {
                synchronized(NoteDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, NoteDataBase::class.java, "notes.db").build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance()
        {
            INSTANCE = null
        }
    }
}
