package android.marshi.wave.activity;

import android.marshi.wave.App;
import android.marshi.wave.presenter.FeedPresenter;
import android.marshi.wave.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	FeedPresenter feedPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		((App)getApplication()).getApplicationComponent().inject(this);
		setContentView(R.layout.activity_main);
	}

}
