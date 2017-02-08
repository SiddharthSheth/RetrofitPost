package ln.retrofitpost.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ln.retrofitpost.R;
import ln.retrofitpost.api.ApiFactory;
import ln.retrofitpost.dbhelper.DatabaseHandler.DatabaseHandler;
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
    private TextView txtTxnId, txtPhone, txtQuantity, txtTotalAmount;
    private ProgressDialog mProgressDialog;
    private CardView cvData;
    String category;
    DatabaseHandler databaseHandler;
    ArrayList<DataResponse.Datum> datumArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initViews();

        cvData.setVisibility(View.INVISIBLE);
        databaseHandler = new DatabaseHandler(this);

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage(getString(R.string.str_please_wait));

        List<String> categories = new ArrayList<String>();
        categories.add("Select One");
        categories.add("current");
        categories.add("past");
        categories.add("future");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spCategory.setAdapter(dataAdapter);

    }

    private void initViews() {
        spCategory = (Spinner) findViewById(R.id.sp_category);
        edUserId = (EditText) findViewById(R.id.ed_userid);
        edPageNumber = (EditText) findViewById(R.id.ed_pagenumber);
        btnGetData = (Button) findViewById(R.id.btn_getdata);
        txtTxnId = (TextView) findViewById(R.id.txt_txnid);
        txtPhone = (TextView) findViewById(R.id.txt_phone);
        txtTotalAmount = (TextView) findViewById(R.id.txt_totalamount);
        txtQuantity = (TextView) findViewById(R.id.txt_quantity);
        cvData = (CardView) findViewById(R.id.cv_data);
        spCategory.setOnItemSelectedListener(this);
        btnGetData.setOnClickListener(this);
    }

    private void getData(String category) {
        mProgressDialog.show();

        DataRequest dataRequest = new DataRequest();

        DataRequest.Data data = new DataRequest().new Data();

        data.setPages(edPageNumber.getText().toString());

        data.setStatus(category);

        data.setUserId(edUserId.getText().toString());

        dataRequest.setData(data);

        makeWsCallForData(dataRequest);

    }

    private void makeWsCallForData(final DataRequest dataRequest) {

        DataService dataService = ApiFactory.createService(DataService.class);

        Call<DataResponse> dataResponseCall = dataService.getResult(dataRequest);

        dataResponseCall.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                mProgressDialog.dismiss();

                if (response.isSuccessful()) {

                    cvData.setVisibility(View.VISIBLE);

                    databaseHandler.addOrder(response);

                    int id = databaseHandler.getCount();

                    Log.d("id",String.valueOf(id));

                    datumArrayList = databaseHandler.getOrders(id);

                    txtTxnId.setText(datumArrayList.get(0).getTxnID());

                    txtPhone.setText(datumArrayList.get(0).getPhone());

                    txtQuantity.setText(datumArrayList.get(0).getQuantity());

                    txtTotalAmount.setText(datumArrayList.get(0).getTotalAmount());

                } else {

                    cvData.setVisibility(View.INVISIBLE);
                    showToast(getString(R.string.str_please_try_again));
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                cvData.setVisibility(View.INVISIBLE);
                showToast("No Response");
                mProgressDialog.dismiss();
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_getdata:

                getData(category);

                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        category = spCategory.getSelectedItem().toString();

//        getData(data);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void showToast(String message) {
        Toast.makeText(DashboardActivty.this, message, Toast.LENGTH_SHORT).show();
    }
}
