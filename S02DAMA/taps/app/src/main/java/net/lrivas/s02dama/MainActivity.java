package net.lrivas.s02dama;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.telephony.PhoneNumberUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import net.lrivas.s02dama.ui.main.SectionsPagerAdapter;
import net.lrivas.s02dama.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    TabLayout tabs;
    Button btn;
    private int[] losIconos = {
        R.drawable.icono_quiensoy,
        R.drawable.icono_tecnologias,
        R.drawable.icono_contactenos
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        btn = findViewById(R.id.btnwhats);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);





        configurarIconos();




    }

    public void configurarIconos(){
        tabs.getTabAt(0).setIcon(losIconos[0]);
        tabs.getTabAt(1).setIcon(losIconos[1]);
        tabs.getTabAt(2).setIcon(losIconos[2]);

    }
}