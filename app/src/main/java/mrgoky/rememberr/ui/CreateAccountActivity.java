package mrgoky.rememberr.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mrgoky.rememberr.R;
import mrgoky.rememberr.vm.CreateAccountViewModel;

public class CreateAccountActivity extends Activity {

	@BindView(R.id.new_name)
	public EditText editName;

	@BindView(R.id.new_email)
	public EditText editEmail;

	@BindView(R.id.confirm_email)
	public EditText confirmEmail;

	@BindView(R.id.create_password)
	public EditText editPassword;

	@BindView(R.id.confirm_password)
	public EditText confirmPassword;

	@OnClick(R.id.sign_up_button)
	void signUp() {
		// TODO: Sign up functionality
	}

	public CreateAccountViewModel viewModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);
		ButterKnife.bind(this);

		viewModel = new CreateAccountViewModel();
	}

	public void validateEmail() {
		viewModel.getValidateEmailSubscriber().onNext(editEmail.getText().toString());
	}
}
