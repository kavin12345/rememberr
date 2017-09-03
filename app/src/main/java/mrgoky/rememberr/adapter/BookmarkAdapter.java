package mrgoky.rememberr.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import mrgoky.rememberr.R;
import mrgoky.rememberr.ui.MainActivity;

public class BookmarkAdapter extends BaseAdapter {

	Context context;
	String[] bookmarkTitles;
	private static LayoutInflater layoutInflater = null;

	public BookmarkAdapter(MainActivity mainActivity, String[] bookmarkTitles) {
		this.context = mainActivity;
		this.bookmarkTitles = bookmarkTitles;
		layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return bookmarkTitles.length;
	}

	@Override
	public Object getItem(int i) {
		return bookmarkTitles[i];
	}

	@Override
	public long getItemId(int i) {
		return 0;
	}

	@Override
	public View getView(final int i, View view, ViewGroup viewGroup) {
		Holder holder = new Holder();
		View rowView;

		rowView = layoutInflater.inflate(R.layout.bookmark_item, null);
		holder.bookmarkTitle = rowView.findViewById(R.id.bookmark_title);
		holder.bookmarkTitle.setText((String) getItem(i));

		rowView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(context, getItem(i).toString(), Toast.LENGTH_SHORT).show();
			}
		});
		return rowView;
	}

	public class Holder {
		TextView bookmarkTitle;
	}
}
