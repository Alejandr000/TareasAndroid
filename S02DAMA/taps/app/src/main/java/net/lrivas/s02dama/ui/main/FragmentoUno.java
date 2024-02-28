package net.lrivas.s02dama.ui.main;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.lrivas.s02dama.R;


public class FragmentoUno extends Fragment {

Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View fragUno = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
        btn = fragUno.findViewById(R.id.btnwhats);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mens = "Hola";

                String nums = "70233274";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+nums +"&text="+mens));
                startActivity(intent);
            }
        });
        return fragUno;



    }



}