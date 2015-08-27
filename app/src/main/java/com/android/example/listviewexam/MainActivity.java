
package com.android.example.listviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<String> mData;
    private ArrayAdapter<String> mAdapter; // Adapter작성
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

        for (int i = 1; i <= 100; i++) {
            mData.add("item " + i);

        }
    }

    private void initAdapter() {
        // initAdapter() 메소드 작성
        mAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, mData);
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
