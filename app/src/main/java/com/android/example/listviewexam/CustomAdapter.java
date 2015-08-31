
package com.android.example.listviewexam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by ws on 2015-08-31. People 데이터를 다루는 어댑터
 */
public class CustomAdapter extends BaseAdapter {
    private List<People> mData;

    public CustomAdapter(Context context, List<People> data){
        mData = data;
    }


    // 아이템의 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    // 해당 포지션에 위치하는 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    // 해당 포지션에 위치하는 아이템의 ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 각 아아템의 레이아웃 결정
     * 
     * @param position
     * @param convertView
     * @param parent
     * @return 완성된 레이아웃
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
