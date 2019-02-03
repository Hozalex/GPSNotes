package corn.orange.notes.view.interfaces

import com.arellomobile.mvp.MvpView
import corn.orange.notes.model.Note

interface MainViewInterface : MvpView {
    fun showNotes(note: Note)
}