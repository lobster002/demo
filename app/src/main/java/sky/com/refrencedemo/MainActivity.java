package sky.com.refrencedemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    private List<Reference> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(this);
        findViewById(R.id.check).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                list.add(RefrenceUtil.decode(getResources(), R.drawable.bg));
                break;
            case R.id.check:
                for( Reference ref : list){
                    if( null == ref.get()){
                        Log.e("TAG","null");
                    }else{
                        Log.e("TAG","OK");
                    }
                }
                list.clear();
                break;
        }
    }
}
