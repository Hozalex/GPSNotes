package corn.orange.gpsnotes.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import corn.orange.gpsnotes.R

class NoteFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        val noteRecycler = inflater?.inflate(R.layout.content_main, container, false)



        return super.onCreateView(inflater, container, savedInstanceState)
    }
}