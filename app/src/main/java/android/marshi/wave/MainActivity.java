package android.marshi.wave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	FeedPresenter feedPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		((App)getApplication()).getApplicationComponent().inject(this);
//		Log.i(feedPresenter.toString(), "tag");
		setContentView(R.layout.activity_main);
	}

}
