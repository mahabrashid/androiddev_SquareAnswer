package gre.example.markswitharray;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class SquareActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView main = (TextView) findViewById(R.id.TextView_Main);

		/* code we are interested in */

		main.setText("");

		for (int i = 0; i < 6; i++) {
			for (int ii = 0; ii < 6; ii++) {
				main.append("*");
			}
			main.append("\n");
		}

	}

}
