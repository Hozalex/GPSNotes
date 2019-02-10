package corn.orange.notes.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note(@PrimaryKey val title: String,
           val content: String) {
}