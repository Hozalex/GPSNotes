package corn.orange.gpsnotes.persistence

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "notes")
class Note(@PrimaryKey(autoGenerate = true) private var id: Long?,
           @ColumnInfo(name = "title") private val title: String,
           @ColumnInfo(name = "content") private val content: String)
{

    fun getTitle(): String
    {
        return title
    }

    fun getContent(): String
    {
        return content
    }
}