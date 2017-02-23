package malin.com.refreshdemo;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.malim.refresh.listener.OnRefreshListener;
import com.malim.refresh.weight.MalinRefreshLayout;
import com.malim.refresh.weight.header.SinaRefreshView;

public class GridViewActivity extends AppCompatActivity {

    private MalinRefreshLayout malinRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        init();
    }

    private void init() {
        malinRefreshLayout = (MalinRefreshLayout)findViewById(R.id.freshlayout);
        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        malinRefreshLayout.setHeaderView(new SinaRefreshView(this));
        malinRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(MalinRefreshLayout refreshLayout) {
                super.onRefresh(refreshLayout);
            }

            @Override
            public void onLoadMore(MalinRefreshLayout refreshLayout) {
                super.onLoadMore(refreshLayout);
            }
        });
    }
}
