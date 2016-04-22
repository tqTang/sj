package cn.studyjams.s1.sj49.wuyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        设置actionbar 标题
        getSupportActionBar().setTitle(R.string.app_title);
    }

    /**
     * 每个标题按钮被按下时执行的方法
     * 跳转至详细内容页面
     * @param view 这里用来获取对应按钮的tag信息，传至内容页面匹配将要显示的图片文字
     */
    public void toContentActivity(View view) {
        Intent intent = new Intent(MainActivity.this, ContentActivity.class);
        intent.putExtra(EXTRA_MESSAGE,view.getTag().toString());
        startActivity(intent);
    }

}
