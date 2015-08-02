package com.example.kazuaki.werewolf;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ItemAdapter extends ArrayAdapter<ItemData>{
    private LayoutInflater inflater;
    private List<ItemData> items;

    public ItemAdapter(Context context,int resource,
                       List<ItemData>objects) {
        super(context, resource, objects);
        // TODO Auto-generated constructor stub
        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        items = objects;
    }
    @Override
    public View getView(int position,View convertView,
                        ViewGroup parent){
        // TODO Auto-generated method stub
        if(convertView == null){
            //xml����View�̐���
            convertView = inflater.inflate(R.layout.listview,null);
        }
        // �w�肳�ꂽ�s(position)�̍��ڃf�[�^�擾
        ItemData item = this.items.get(position);
        // �摜���Z�b�g
        ImageView img = (ImageView)convertView.findViewById(R.id.itemimage_id);
        img.setImageBitmap(item.getImage());
        // �e�L�X�g���Z�b�g
        TextView info = (TextView)convertView.findViewById(R.id.itemtext_id);
        info.setText(item.getText());

        return convertView;
    }
}
