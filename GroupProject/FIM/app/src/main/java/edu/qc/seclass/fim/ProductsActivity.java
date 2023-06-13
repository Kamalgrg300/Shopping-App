package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        SearchView searchView = findViewById(R.id.searchView);
        //*******************************************************************
        // THIS IS SAMPLE DATA FOR TESTING
        // ******************************************************************
        List<Item> items = new ArrayList<>();
        items.add(new Item("some color", "some brand", 999, 99.99f, R.drawable.tile_image));
        items.add(new Item("Wood", "Red", "IKEA", 5, 50.00f, R.drawable.wood_image));
        items.add(new Item("some color", "some brand", 999, 99.99f, R.drawable.tile_image));
        items.add(new Item("Wood", "Red", "IKEA", 5, 50.00f, R.drawable.wood_image));

        MyAdapter recyclerAdapter = new MyAdapter(getApplicationContext(), items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                recyclerAdapter.getFilter().filter(s);
                return false;
            }
        });
    }
}