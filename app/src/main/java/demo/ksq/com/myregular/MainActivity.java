package demo.ksq.com.myregular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    //只能字母
//    private String regular = "^[A-Za-z]+$";
//    private String regular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([a-zA-Z0-9]{6,20})$";
    //只能字母开头3到5个数字结尾
    private String regular = "^[A-Za-z]+[0-9]{3,5}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editText);

    }

    public void verify(View view) {
        String str = text.getText().toString();
        if (TextUtils.isEmpty(str) || !str.matches(regular)) {
            Toast.makeText(this, "不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
//        String s = str.toUpperCase();
        Log.d("zzzzzzz", str);
    }
}
