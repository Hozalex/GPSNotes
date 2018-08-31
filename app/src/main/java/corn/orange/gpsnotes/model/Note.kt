package corn.orange.gpsnotes.model

import android.arch.persistence.room.Entity

@Entity
class Note(private val title: String, private val content: String)
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