package corn.orange.gpsnotes.persistence

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

@Dao
interface NoteDataDao
{
    @Query("SELECT * From notes")
    fun getAll(): List<Note>

    @Insert(onConflict = REPLACE)
    fun insert(note: Note)

    @Query("DELETE from notes")
    fun deleteAll()
}