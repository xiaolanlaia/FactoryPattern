package com.example.factorypattern;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取显示查询的TextView对象
        final TextView tvContent = (TextView)findViewById(R.id.factory_content_tv);

        //获取查询普通文件数据的按钮对象并设置监听
        Button btnFile = (Button)findViewById(R.id.factory_content_btn);
        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IOHandler handler = IOFactory.getIOHander(FileHandler.class);
                Log.d("AigeStudio", handler.query("445566"));
                tvContent.setText(handler.query("445566"));
            }
        });

        //获取查询xml文件数据的按钮对象并设置监听
        Button btnXml = (Button)findViewById(R.id.factory_xml_btn);
        btnXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IOHandler handler = IOFactory.getIOHander(FileHandler.class);
                Log.d("AigeStudio", handler.query("445566"));
                tvContent.setText(handler.query("445566"));
            }
        });
        //获取查询数据库的按钮对象并设置监听
        Button btnDb = (Button)findViewById(R.id.factory_db_btn);
        btnDb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IOHandler handler = IOFactory.getIOHander(FileHandler.class);
                Log.d("AigeStudio", handler.query("445566"));
                tvContent.setText(handler.query("445566"));
            }
        });
    }
}
