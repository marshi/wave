package android.marshi.wave.activity;

import android.databinding.DataBindingUtil;
import android.marshi.wave.App;
import android.marshi.wave.databinding.ActivityMainBinding;
import android.marshi.wave.presenter.FeedPresenter;
import android.marshi.wave.R;
import android.marshi.wave.ui.ButtonInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements ButtonInterface {

	@Inject
	FeedPresenter feedPresenter;

	ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		((App)getApplication()).getApplicationComponent().inject(this);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		binding.button.setOnClickListener(v -> {onTap(v);});
	}

	@Override
	public void onTap(View view) {
		binding.text.setText(feedPresenter.feedText());
	}
}
