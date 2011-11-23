package id.web.freelancer.example;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.CheckBox;
import android.widget.TextView;

public class ClickableTextViewExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        CheckBox checkbox = (CheckBox)findViewById(R.id.checkBox1);
        TextView textView = (TextView)findViewById(R.id.textView2);
        
        checkbox.setText("");
        
        StringBuilder html = new StringBuilder();
        html.append("Contoh klik, buka <a href='http://bayu.freelancer.web.id/'>URL</a>");
        html.append(" dan ");
        html.append("<a href='lauch.TCActivity://Kode?param1=isi-param'>Activity</a>");
        
        textView.setText( Html.fromHtml( html.toString() ) );
        
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}