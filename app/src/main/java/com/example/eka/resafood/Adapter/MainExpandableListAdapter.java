package com.example.eka.resafood.Adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eka.resafood.Data.FoodListChild;
import com.example.eka.resafood.Data.FoodListGroup;
import com.example.eka.resafood.R;
import com.example.eka.resafood.databinding.MainListviewGroupBinding;

import java.util.ArrayList;

/**
 * Created by eka on 2017. 6. 12..
 */

public class MainExpandableListAdapter implements ExpandableListAdapter {
    ArrayList<ArrayList<FoodListChild>> child = new ArrayList<>();
    ArrayList<FoodListGroup> groups = new ArrayList<>();
    Context context;

    public MainExpandableListAdapter(ArrayList<ArrayList<FoodListChild>> child, ArrayList<FoodListGroup> groups, Context context) {
        this.child = child;
        this.groups = groups;
        this.context = context;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return child.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.main_listview_group, null);

        TextView title = (TextView) convertView.findViewById(R.id.group_title);
        TextView count = (TextView) convertView.findViewById(R.id.group_count);
        TextView modified = (TextView) convertView.findViewById(R.id.group_modified);

        LinearLayout bottom = (LinearLayout) convertView.findViewById(R.id.GroupBottomIndicator);

        title.setText(groups.get(groupPosition).getTitle());
        if (isExpanded && !isChildEmpty(groupPosition)) {
            bottom.setVisibility(View.VISIBLE);
        } else {
            bottom.setVisibility(View.GONE);
        }
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.main_listview_child, null);
        TextView title = (TextView) convertView.findViewById(R.id.child_title);
        TextView added = (TextView) convertView.findViewById(R.id.child_added);

        LinearLayout top = (LinearLayout) convertView.findViewById(R.id.ChildTopIndicator);
        LinearLayout middle = (LinearLayout) convertView.findViewById(R.id.ChildMiddleIndicator);
        LinearLayout bottom = (LinearLayout) convertView.findViewById(R.id.ChildBottomIndicator);

        title.setText(child.get(groupPosition).get(childPosition).getTitle());

        top.setVisibility(View.VISIBLE);
        middle.setVisibility(View.VISIBLE);
        if (isLastChild) {
            bottom.setVisibility(View.GONE);
        } else {
            bottom.setVisibility(View.VISIBLE);
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return 0;
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }

    public boolean isChildEmpty(int groupPosition) {
        if (child.get(groupPosition).isEmpty())
            return true;
        else
            return false;
    }
}
