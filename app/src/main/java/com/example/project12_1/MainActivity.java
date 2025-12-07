package com.example.project12_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) { // 리스트 뷰에 대응할 변수 작성
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 배열 만들기
        String[] movie = {"범죄와의 전젱", "신세계", "굿뉴스", "사생결단", "베테랑", "달콤한 인생",
            "전설의 주먹", "시동", "범죄도시", "악인전", "남자가 사랑할 떄", "부당거래", "히트맨",
            "위대한 개츠비", "거룩한 계보", "친구"};

        ListView list = (ListView) findViewById(R.id.listView);

        // ArrayAdapter 선언
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
            (this, android.R.layout.simple_list_item_multiple_choice, movie);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setAdapter(adapter); // 어레이 어댑터 적용

        // 클릭 리스너 작성
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), movie[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}