package android.marshi.wave;

import android.content.Context;
import android.marshi.wave.databinding.FeedCardBinding;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a13178 on 2017/01/10.
 */

public class FeedRecyclerViewAdapter extends RecyclerView.Adapter<BindingHolder<FeedCardBinding>> {

    private Context context;

    private List<FeedCard> feedList = new ArrayList<>();

    public FeedRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BindingHolder<FeedCardBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BindingHolder<>(context, parent, R.layout.feed_card);
    }

    @Override
    public void onBindViewHolder(BindingHolder<FeedCardBinding> holder, int position) {
        FeedCard feedCard = feedList.get(position);
        holder.binding.setFeedCard(feedCard);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
