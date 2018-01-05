package com.example.mariu.recipe_organizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   // private TextView text1;
    List<DataItem> dataItemList = DataProvider.dataItemList;
    List<String> itemNames = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testing the output
//        DataItem item =
//                new DataItem(null, "My menu item", "A Category", "A description", 1, 9.95,
//                "C:\\Users\\Mariu\\Desktop\\RecipeOrganizer\\assets\\Apple_pie.jpg");

//        text1 = (TextView) findViewById(R.id.out);
//        text1.setText("");
//
//        //sorting items A-Z
        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem t1, DataItem t2) {
                return t1.getItemName().compareTo(t2.getItemName());
            }
        });

        //shows all items created in DataProvider Class
//        for (DataItem item: dataItemList) {
//            //text1.append(item.getItemName() + "\n");
//            itemNames.add(item.getItemName());
//        }
//        Collections.sort(itemNames);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_list_item_1, itemNames);

        DataItemAdapter adapter = new DataItemAdapter(this, dataItemList);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);

    }
}
