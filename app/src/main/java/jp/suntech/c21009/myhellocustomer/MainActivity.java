package jp.suntech.c21009.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener Listener = new HelloListener();
        btClick.setOnClickListener(Listener);

        Button btCLive = findViewById(R.id.btCLive);
        btCLive.setOnClickListener(Listener);

        Button btCName = findViewById(R.id.btCName);
        btCName.setOnClickListener(Listener);
    }

    private class HelloListener implements View.OnClickListener {
        //イベントハイドラ <= イベント発生時の処理
        @Override
        public void onClick(View view) {
            EditText inputLive = findViewById(R.id.etLive);
            EditText inputName = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id) {
                case R.id.btClick:
                    String LiveStr = inputLive.getText().toString();
                    String NameStr = inputName.getText().toString();
                    output.setText(LiveStr + "にお住いの" + NameStr + "さん、こんにちは！");
                    break;
                case R.id.btCLive:
                    inputLive.setText("");
                    output.setText("");
                    break;
                case R.id.btCName:
                    inputName.setText("");
                    output.setText("");
                    break;
            }
        }
    }
}