package edu.bhcc.xianbinzhen.mixandmatch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by xianbinZhen on 10/1/2017.
 */

public class MixAndMatchFragment extends Fragment{
    private Medicine mMedicine;
    private ListView lvMedicine;
    private TextView tvMedicine;
    private String[] str;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View v = inflater.inflate(R.layout.fragment_mix_match, container, false);
        mMedicine = new Medicine("Acyclovir", "Zovirax®", "Herpes Mgmt", "C-IV","Refrigerated","Anti-viral","Anti-Infectives");
        str = mMedicine.toStringArray();
        tvMedicine = v.findViewById(R.id.tvGernericName);
        tvMedicine.setText(mMedicine.genericName);
        lvMedicine = (ListView) v.findViewById(R.id.lvMedicine);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), R.layout.list_view_item, str);
        lvMedicine.setAdapter(adapter);
        lvMedicine.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), ""+position,
                        Toast.LENGTH_SHORT).show();

            }
        });
        return v;
    }


}
