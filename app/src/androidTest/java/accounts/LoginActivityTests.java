package accounts;

import android.app.Activity;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;

import ie.livingcode.samples.autotesting.R;
import ie.livingcode.samples.autotesting.accounts.LoginActivity;

/**
 * Test class for the login activity
 * Created by Mark on 01/07/2014.
 */
public class LoginActivityTests extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Activity mLoginActivity;
    private Context mContext;

    /**
     * Note that here we do not use the default constructor. Instead only initialise
     * the class passing the reference to the activity under test.
     */
    public LoginActivityTests() {
        super(LoginActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mLoginActivity = getActivity();
        mContext = mLoginActivity.getApplicationContext();
    }

    /**
     * Test that all UI elements which we interact with on our
     * activity are present
     * @throws Exception
     */
    public void testUIElementsArePresent() throws Exception {
        assertNotNull(mLoginActivity.findViewById(R.id.email));
        assertNotNull(mLoginActivity.findViewById(R.id.password));
        assertNotNull(mLoginActivity.findViewById(R.id.login_form));
        assertNotNull(mLoginActivity.findViewById(R.id.login_progress));
        assertNotNull(mLoginActivity.findViewById(R.id.email_sign_in_button));
    }
}
