package mrgoky.rememberr.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mrgoky.rememberr.R;

public class LoginActivity extends Activity {

	@BindView(R.id.edit_email)
	EditText editEmail;

	@BindView(R.id.edit_password)
	EditText editPassword;

	@OnClick(R.id.login_button)
	void login() {
		// TODO: login functionality
	}

	@OnClick(R.id.sign_up_button)
	void goToSignUpActivity() {
		Intent intent = new Intent(this, CreateAccountActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ButterKnife.bind(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
		// For getting user
	}
}
