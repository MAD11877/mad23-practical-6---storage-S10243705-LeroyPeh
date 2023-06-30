package sg.edu.np.mad.madpractical6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import sg.edu.np.mad.madpractical1.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dbhandler dbquerymachine = new dbhandler(this, null, null, 1);

        ArrayList<User> dataList;
        dataList = dbquerymachine.getUsers();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        Adapter userinfo = new Adapter(dataList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(ListActivity.this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userinfo);


    }
}