
package com.android.example.listviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<People> mData;
    private CustomAdapter mAdapter; // Adapter작성
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.Data 준비
        initData();

        // 2. Adapter 준비
        initAdapter();

        // 3. ListView 에 Adapter 설정.
        initListView();
    }

    private void initData() {
        mData = new ArrayList<>();
        mData.add(new People(R.drawable.trap, "함정카드", "010-1111-1111"));
        mData.add(new People(R.drawable.dog, "멍멍이", "010-2222-2222"));

        for(int i = 1; i<= 30; i++){
            mData.add(new People(R.mipmap.ic_launcher,"아무개" +i, "번호없음"));
        }

        }

    private void initAdapter() {
        mAdapter =new CustomAdapter(getApplicationContext(), mData);
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
