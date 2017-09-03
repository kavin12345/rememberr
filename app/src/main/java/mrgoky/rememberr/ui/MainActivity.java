package mrgoky.rememberr.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import mrgoky.rememberr.R;
import mrgoky.rememberr.adapter.BookmarkAdapter;

public class MainActivity extends AppCompatActivity {

	ListView listView;
	BookmarkAdapter bookmarkAdapter;

	public static String[] sampleTexts = { "Goky", "Is", "Really", "Cool" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = (ListView) this.findViewById(R.id.bookmark_list_view);

		bookmarkAdapter = new BookmarkAdapter(this, sampleTexts);
		listView.setAdapter(bookmarkAdapter);
	}
}
