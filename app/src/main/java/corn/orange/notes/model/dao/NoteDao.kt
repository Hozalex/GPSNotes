package corn.orange.notes.model.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import corn.orange.notes.model.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note) {

    }

    @Query("SELECT * from notes_table")
    fun getAllNotes(): List<Note>

    @Query("DELETE from notes_table")
    fun deleteAll()
}