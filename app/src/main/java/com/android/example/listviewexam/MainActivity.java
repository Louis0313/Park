
package com.android.example.listviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private List<Map<String, String>> mData;
    private SimpleAdapter mAdapter; // Adapter작성
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
            Map<String, String> data = new HashMap<>();
            data.put("item", "Item " + i);
            data.put("subitem", "Sub Item " + i);
            mData.add(data);

        }
    }

    private void initAdapter() {
        // Adapter 준비
        mAdapter = new SimpleAdapter(getApplicationContext(), mData,
                android.R.layout.simple_list_item_2,
                new String[]{"item", "subitem"},
                // item의 data를 마인드 할 view의 id 지정
                new int[]{android.R.id.text1, android.R.id.text2});
                // subitem의 data를 마인드 할 view의 id 지정
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
