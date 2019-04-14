package corn.orange.simplenotes.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import corn.orange.simplenotes.model.Note

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