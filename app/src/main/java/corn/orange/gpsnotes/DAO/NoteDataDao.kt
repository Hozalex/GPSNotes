package corn.orange.gpsnotes.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import corn.orange.gpsnotes.model.Note

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