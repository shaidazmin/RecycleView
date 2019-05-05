 package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

 public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int [] flags = {R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria, R.drawable.andorra, R.drawable.angola,
            R.drawable.bahrain, R.drawable.bangladesh, R.drawable.belarus, R.drawable.belgium, R.drawable.cambodia,
            R.drawable.cameroon, R.drawable.canada};

    String[] country;

    MyClass myClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = getResources().getStringArray(R.array.countryName);

        recyclerView =(RecyclerView) findViewById(R.id.recycler_view_id);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myClass = new MyClass(flags,country);

        recyclerView.setAdapter(myClass);

       // recyclerView.setAdapter(new MyClass(flags,country));
    }
}

