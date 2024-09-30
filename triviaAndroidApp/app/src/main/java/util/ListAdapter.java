package util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.triviaapp.R;

import java.util.List;

import models.ListElement;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context mContext;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mData = itemList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItems(List<ListElement> items) {
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, topic, author, time;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameCV);
            topic = itemView.findViewById(R.id.topicCV);
            author = itemView.findViewById(R.id.authorCV);
            time = itemView.findViewById(R.id.timeCV);
        }

        void bindData(final ListElement item) {
            name.setText(item.getName());
            topic.setText(item.getTopic());
            author.setText(item.getAuthor());
            time.setText(item.getTime());
        }
    }
}
