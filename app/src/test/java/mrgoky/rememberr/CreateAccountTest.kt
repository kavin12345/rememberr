package mrgoky.rememberr

import org.junit.Before
import org.junit.runner.RunWith
import android.app.Activity
import mrgoky.rememberr.ui.CreateAccountActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class CreateAccountTest {

    lateinit var createAccountActivity: CreateAccountActivity
    lateinit var activity: Activity

    @Before
    fun setup() {
//        createAccountActivity = Robolectric.setupActivity(CreateAccountActivity::class.java)
        activity = Robolectric.buildActivity(CreateAccountActivity::class.java).create().get()
    }

    @Test
    fun testEmailIsValid() {
        val emailEditText = createAccountActivity.editEmail
        emailEditText.setText("amy@gmail.com")
        createAccountActivity.validateEmail()
        assertEquals("", emailEditText.error)
    }
}
