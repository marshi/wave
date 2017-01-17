package android.marshi.wave.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.marshi.wave.App;
import android.marshi.wave.FeedRecyclerViewAdapter;
import android.marshi.wave.R;
import android.marshi.wave.databinding.ActivityFeedTimelineBinding;
import android.marshi.wave.presenter.FeedPresenter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import javax.inject.Inject;

public class FeedTimelineActivity extends AppCompatActivity {

    @Inject
    FeedPresenter feedPresenter;

    ActivityFeedTimelineBinding binding;

    public static void start(Context context) {
        Intent intent = new Intent(context, FeedTimelineActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_feed_timeline);
        ((App)getApplication()).getApplicationComponent().inject(this);
        RecyclerView feedRecyclerView = binding.feedRecyclerView;
        feedRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        FeedRecyclerViewAdapter adapter = new FeedRecyclerViewAdapter(this);
        feedPresenter.feedText(adapter);
        feedRecyclerView.setAdapter(adapter);
    }

}
