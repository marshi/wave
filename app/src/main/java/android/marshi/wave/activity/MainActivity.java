package android.marshi.wave.activity;

import android.databinding.DataBindingUtil;
import android.marshi.wave.App;
import android.marshi.wave.R;
import android.marshi.wave.databinding.ActivityMainBinding;
import android.marshi.wave.presenter.FeedPresenter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	FeedPresenter feedPresenter;

	ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		((App)getApplication()).getApplicationComponent().inject(this);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		FeedTimelineActivity.start(this);
	}

}
