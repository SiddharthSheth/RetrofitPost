package ln.retrofitpost.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ln.retrofitpost.R;
import ln.retrofitpost.api.ApiFactory;
import ln.retrofitpost.request.DataRequest;
import ln.retrofitpost.response.DataResponse;
import ln.retrofitpost.service.DataService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DashboardActivty extends AppCompatActivity implements AdapterView.OnItemSelectedListener,View.OnClickListener{

    private Spinner spCategory;
    private EditText edUserId, edPageNumber;
    private Button btnGetData;
    private ProgressDialog mProgressDialog;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initViews();

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage(getString(R.string.str_please_wait));

        List<String> categories = new ArrayList<String>();
        categories.add("Select One");
        categories.add("Current");
        categories.add("Past");
        categories.add("Future");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spCategory.setAdapter(dataAdapter);

    }

    private void initViews() {
        spCategory = (Spinner) findViewById(R.id.sp_category);
        edUserId = (EditText) findViewById(R.id.ed_userid);
        edPageNumber = (EditText) findViewById(R.id.ed_pagenumber);
        btnGetData = (Button) findViewById(R.id.btn_getdata);
        spCategory.setOnItemSelectedListener(this);
        btnGetData.setOnClickListener(this);
    }

    private void getData(String category) {
        mProgressDialog.show();

        DataRequest dataRequest = new DataRequest();

        DataRequest.Data data = new DataRequest().new Data();

        data.setPage(edPageNumber.getText().toString());

        data.setStatus(String.valueOf(1));

        data.setUserId(edUserId.getText().toString());

        dataRequest.setData(data);

        makeWsCallForData(dataRequest);

    }

    private void makeWsCallForData(DataRequest dataRequest) {

        DataService dataService = ApiFactory.createService(DataService.class);

        Call<DataResponse> dataResponseCall = dataService.getResult(dataRequest);

        dataResponseCall.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                mProgressDialog.dismiss();

                if (response.isSuccessful()) {

                    showToast(response.body().getData().get(0).getTxnID());

                } else {

                    showToast(getString(R.string.str_please_try_again));
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Log.d("error",t.toString());
                showToast("No Response");
                mProgressDialog.dismiss();
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_getdata:

                getData(data);

                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        data = spCategory.getSelectedItem().toString();

//        getData(data);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void showToast(String message) {
        Toast.makeText(DashboardActivty.this, message, Toast.LENGTH_SHORT).show();
    }
}
