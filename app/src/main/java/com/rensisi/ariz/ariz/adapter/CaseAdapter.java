package com.rensisi.ariz.ariz.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rensisi.ariz.ariz.R;

import java.util.List;

/**
 * Created by kellen_home on 2016/11/30.
 */

public class CaseAdapter extends BaseAdapter {
    private List<String> mAppList;
    Context context;

    public CaseAdapter(Context context, List<String> mAppList) {
        this.context = context;
        this.mAppList = mAppList;
    }

    @Override
    public int getCount() {
        return mAppList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAppList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_listview, null);
            new ViewHolder(convertView);
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.title.setText(mAppList.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView title;
        public ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.title_lv);
            view.setTag(this);
        }




    }
}

