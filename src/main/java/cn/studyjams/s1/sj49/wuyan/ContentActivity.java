package cn.studyjams.s1.sj49.wuyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 详细内容展示
 */
public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        //获取MainActivity传过来的tag信息
        Intent intent = getIntent();
        String tag = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //将tag设置为当前页面的标题
        getSupportActionBar().setTitle(tag);

        selectContent(tag);

    }

    /**
     * 根据tag设置显示的内容
     * @param tag
     */
    private void selectContent(String tag){
        //5things的内容集合
        String[] things = {getString(R.string.thing_1_title), getString(R.string.thing_2_title),
                getString(R.string.thing_3_title), getString(R.string.thing_4_title), getString(R.string.thing_5_title)};
        int[] imgs = {R.drawable.thing_1, R.drawable.thing_2, R.drawable.thing_3, R.drawable.thing_4, R.drawable.thing_5};
        String[] contents = {getString(R.string.thing_1_content), getString(R.string.thing_2_content),
                getString(R.string.thing_3_content), getString(R.string.thing_4_content), getString(R.string.thing_5_content)};

        //匹配传值tag ，设置对应图片和文字
        for (int i = 0; i < things.length; i++) {
            if (tag.equals(things[i])) {
                ImageView imageView = (ImageView) findViewById(R.id.content_img);
                imageView.setImageResource(imgs[i]);
                TextView textView = (TextView) findViewById(R.id.content_text);
                textView.setText(contents[i]);
                break;
            }
        }
    }
}
