package com.example.kimi.sbus;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Main3Activity extends AppCompatActivity {
    public List<Map<String, Object>> mData;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView _listv = (ListView) findViewById(R.id.list3);
        mData = getData();
        MyAdapter adapter = new MyAdapter(this);
        _listv.setAdapter(adapter);

        _listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.getChildAt(i);
                Toast.makeText(Main3Activity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("row2_1", "G1");
        map.put("row2_2", "google 1");
        map.put("row2_3", "1");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("row2_1", "G2");
        map.put("row2_2", "google 2");
        map.put("row2_3", "2");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("row2_1", "G3");
        map.put("row2_2", "google 3");
        map.put("row2_3", "3");
        list.add(map);

        return list;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main3 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }


    public final class ViewHolder {
        public TextView t1;
        public TextView t2;
        public TextView t3;
        public Button b1;
    }

    public ProgressDialog _progressDialog = null;
    Handler handler = new Handler() {
        @Override
        public void publish(LogRecord logRecord) {

        }

//        public void HandleMessage(Message msg){
//            if(_progressDialog != null){
//                _progressDialog.dismiss();
//            }
//            super.HandleMessage(msg);
//            if(msg.what == 1){
//                String[] citys = (String[]) msg.obj;
//                Log.i("city",citys[0]);
//                SourceDateList = filledData(citys);
//                Collections.sort();
//                adapter = new SortA
//           }
//        }


        @Override
        public void flush() {

        }

        @Override
        public void close() throws SecurityException {

        }
    };

    public class MyAdapter extends BaseAdapter {
        private LayoutInflater mInflater;

        public MyAdapter(Context context) {
            this.mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewHolder holder = null;
            if (view == null) {

                holder = new ViewHolder();
                view = mInflater.inflate(R.layout.row2, null);
                holder.t1 = (TextView) view.findViewById(R.id.row2_1);
                holder.t2 = (TextView) view.findViewById(R.id.row2_2);
                holder.t3 = (TextView) view.findViewById(R.id.row2_3);
                holder.b1 = (Button) view.findViewById(R.id.row2_4);

            } else {
                holder = (ViewHolder) view.getTag();
            }

            holder.t1.setText((String) mData.get(i).get("row2_1"));
            holder.t2.setText((String) mData.get(i).get("row2_2"));
            holder.t3.setText((String) mData.get(i).get("row2_3"));

            holder.b1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(Main3Activity.this, "button" + i, Toast.LENGTH_SHORT).show();

//                    ProgressDialog _progressDialog = ProgressDialog.show(Main3Activity.this,null,"Loading...");
//                    new Thread() {
//                        public void run(){
//                            Message msg = handler.obtainMessage();
//                            DefaultHttpClient client = new DefaultHttpClient();
//                            HttpGet _get = new HttpGet("");
//                            HttpResponse response = null;
//                            try {
//                                response = client.execute(_get);
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            String result = null;
//                            try {
//                                result = EntityUtils.toString(response.getEntity());
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//
//                            JSONObject object = JSONObject.fromObject(result);
//                            try {
//                                if(object.getInt("error_code")==0){
//                                    String json = object.get("result").toString();
//                                    Gson gson = new GsonBuilder().create();
//                                    String[] _citys = gson.fromJson(json,String[].class);
//                                    Log.i("outcome:", EntityUtils.toString(response.getEntity()));
//                                    msg.what = 1;
//                                    try {
//                                        System.out.println(object.get("error_code")+":");
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//
//
//                        }
//
//                    }.start();





                }
            });

            return view;
        }
    }


}
