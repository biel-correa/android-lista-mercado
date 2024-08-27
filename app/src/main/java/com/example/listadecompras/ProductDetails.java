package com.example.listadecompras;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.listadecompras.mocks.Mock;
import com.example.listadecompras.models.Item;

public class ProductDetails extends AppCompatActivity {
    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getItem();
        setTitle("Ver " + item.getName());
        render();
    }

    private void render() {
        if (item == null) {
            return;
        }

        TextView name = findViewById(R.id.name);
        name.setText(item.getName());

        TextView description = findViewById(R.id.description);
        description.setText(item.getDescription());

        TextView price = findViewById(R.id.price);
        price.setText(String.valueOf(item.getFormattedPrice()));
    }

    private void getItem() {
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        item = Mock.items.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
    }
}