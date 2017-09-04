package mrgoky.rememberr.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mrgoky.rememberr.R;

public class CreateAccountActivity extends Activity {

	@BindView(R.id.new_name)
	EditText editName;

	@BindView(R.id.new_email)
	EditText editEmail;

	@BindView(R.id.confirm_email)
	EditText confirmEmail;

	@BindView(R.id.create_password)
	EditText editPassword;

	@BindView(R.id.confirm_password)
	EditText confirmPassword;

	@OnClick(R.id.sign_up_button)
	void signUp() {
		// TODO: Sign up functionality
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);
		ButterKnife.bind(this);
	}
}
