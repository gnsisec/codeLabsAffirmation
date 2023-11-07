package com.example.codelabsaffirmation
import android.content.Context
import com.example.codelabsaffirmation.adapter.ItemAdapter
import com.example.codelabsaffirmation.model.Affirmation
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val context = mock(Context::class.java)
    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation1, R.drawable.image1)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}