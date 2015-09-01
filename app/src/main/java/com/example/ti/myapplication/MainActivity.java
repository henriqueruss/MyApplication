package com.example.ti.myapplication;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(android.R.id.list);

        List<Zombie> zombies = gerarZombies();
        final ArrayAdapter<Zombie> zombiesAdapter = new ArrayAdapter<Zombie>(this, android.R.layout.simple_list_item_1, zombies);
        listView.setAdapter(zombiesAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Zombie zombie = zombiesAdapter.getItem(position);
                Toast.makeText(MainActivity.this, zombie.getNome()+"\n"+zombie.getIdade(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private List<Zombie> gerarZombies() {
        List<Zombie> zombies = new ArrayList<Zombie>();
        zombies.add(criarZombie("Shane", 23));
        zombies.add(criarZombie("Hershel", 23));
        zombies.add(criarZombie("Glen", 23));

        return zombies;
    }

    private Zombie criarZombie(String nome, int idade) {
        Zombie zombie = new Zombie(nome, idade);
        return zombie;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}