package net.lrivas.s02dama.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.lrivas.s02dama.R;


public class FragmentoTres extends Fragment {

    Button btnsEmail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View Fragtres = inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
        btnsEmail = Fragtres.findViewById(R.id.button3);

        btnsEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);


                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"u20210939@univo.edu.sv"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Me interesa tus servicios");



                intent.setType("message/rfc822");

                startActivity(Intent.createChooser(intent, ""));

        }
        });
        return Fragtres;
    }
}