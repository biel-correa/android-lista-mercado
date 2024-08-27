package com.example.listadecompras.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.listadecompras.ProductDetails;
import com.example.listadecompras.R;
import com.example.listadecompras.models.Item;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private final List<Item> items;
    private final LayoutInflater inflater;

    public ItemAdapter(Context context, List<Item> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Item getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, parent, false);
        }

        Item item = getItem(position);

        RelativeLayout layout = view.findViewById(R.id.card);
        setOnClickListener(view, layout, item);

        TextView name = view.findViewById(R.id.name);
        name.setText(item.getName());

        TextView description = view.findViewById(R.id.description);
        description.setText(item.getDescription());

        TextView price = view.findViewById(R.id.price);
        price.setText(String.valueOf(item.getFormattedPrice()));

        return view;
    }

    private void setOnClickListener(View view, RelativeLayout layout, Item item) {
        layout.setOnClickListener(v -> {
            Intent intent = new Intent(view.getContext(), ProductDetails.class);
            intent.putExtra("id", item.getId());
            view.getContext().startActivity(intent);
        });
    }
}
