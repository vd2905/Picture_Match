package MyAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.picture_puzzles.LevelActivity;
import com.example.picture_puzzles.R;

public class ListAdapter extends BaseAdapter
{
    LevelActivity levelActivity;
    int[] levelNo;
    public ListAdapter(LevelActivity levelActivity, int[] levelNo)
    {
        this.levelActivity = levelActivity;
        this.levelNo = levelNo;
    }

    @Override
    public int getCount() {
        return levelNo.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(levelActivity).inflate(R.layout.level_item,parent,false);

        TextView textView = convertView.findViewById(R.id.txtview);
        textView.setText("LEVEL "+levelNo[position]);

        return convertView;
    }
}
