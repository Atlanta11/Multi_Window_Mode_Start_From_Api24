package enterprise.sample.com.multi_window_mode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textPrompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPrompt = (TextView)findViewById(R.id.prompt);

        if(isInMultiWindowMode()){
            textPrompt.setText("onCreate run In Multi Window Mode ");
        }else{
            textPrompt.setText("onCreate run NOT In Multi Window Mode ");
        }

        Toast.makeText(MainActivity.this,
                "onCreate() called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        if(isInMultiWindowMode){
            textPrompt.setText("It is In Multi Window Mode ");
        }else{
            textPrompt.setText("It is NOT In Multi Window Mode ");
        }

        Toast.makeText(MainActivity.this,
                "onMultiWindowModeChanged() called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Toast.makeText(MainActivity.this,
                "onConfigurationChanged() called", Toast.LENGTH_LONG).show();
    }
}
