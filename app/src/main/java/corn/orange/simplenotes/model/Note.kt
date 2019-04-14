package corn.orange.simplenotes.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note(@PrimaryKey val title: String,
           val content: String) {
}