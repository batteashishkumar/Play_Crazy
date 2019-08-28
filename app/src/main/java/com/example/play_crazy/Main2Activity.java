package com.example.play_crazy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        db=new Database(this);

    }
    @OnClick({R.id.run1_txt, R.id.run2_txt,R.id.run3_txt,R.id.run4_txt,R.id.run6_txt,R.id.dot,R.id.plus1,R.id.wide_btn,R.id.noball_btn,R.id.wicket_btn})
    public void onItemClicked(View view) {
        switch (view.getId()) {
            case R.id.run1_txt:
               add_run(1);
                break;
            case R.id.run2_txt:
                add_run(2);
                break;
            case R.id.run3_txt:
                add_run(3);
                break;
            case R.id.run4_txt:
                add_run(4);
                break;
            case R.id.run6_txt:
                add_run(6);
                break;
            case R.id.dot:
                Toast.makeText(this,"run1",Toast.LENGTH_LONG).show();
                break;
            case R.id.plus1:
                Toast.makeText(this,"run1",Toast.LENGTH_LONG).show();
                break;
            case R.id.wide_btn:
                Toast.makeText(this,"run1",Toast.LENGTH_LONG).show();
                break;
            case R.id.noball_btn:
                Toast.makeText(this,"run1",Toast.LENGTH_LONG).show();
                break;
            case R.id.wicket_btn:
                Toast.makeText(this,"run1",Toast.LENGTH_LONG).show();
                break;

        }
    }

    private void add_run(int i) {
//    Toast.makeText(this,""+String.valueOf(db.current_over()),Toast.LENGTH_LONG).show();


    }
}
