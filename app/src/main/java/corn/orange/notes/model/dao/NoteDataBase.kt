package corn.orange.notes.model.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import corn.orange.notes.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        private lateinit var INSTANCE: NoteDataBase
        fun getDatabase(context: Context): NoteDataBase {
            if (INSTANCE == null) {
                synchronized(NoteDataBase::class) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.applicationContext, NoteDataBase::class.java, "note_database").build()
                    }
                }
            }
            return INSTANCE
        }
    }
}