package project.hn.com.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Simple view holder for a single text view.
 */
class CountryViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;
   // private TextView mTextView1;

    CountryViewHolder(View view) {
        super(view);

        mTextView = (TextView) view.findViewById(R.id.text);
       // mTextView1 = (TextView) view.findViewById(R.id.text1);
    }

    public void bindItem(String text) {
        mTextView.setText(text);
       // mTextView1.setText(text);
    }

    @Override
    public String toString() {
        return mTextView.getText().toString();
    }
}
