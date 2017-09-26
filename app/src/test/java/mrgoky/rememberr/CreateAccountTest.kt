package mrgoky.rememberr

import android.app.Activity
import mrgoky.rememberr.ui.CreateAccountActivity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertTrue
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class CreateAccountTest {
    lateinit var createAccountActivity: CreateAccountActivity
    lateinit var activity: Activity

    @Before
    fun setup() {
        activity = Robolectric.buildActivity()
        createAccountActivity = CreateAccountActivity()
    }

    @Test
    fun testEmailIsValid() {
        val emailEditText = createAccountActivity.editEmail
        emailEditText.setText("amy@gmail.com")
        createAccountActivity.validateEmail()
        assertEquals("", emailEditText.error)
    }
}
