package ln.retrofitpost.dbhelper.DatabaseHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import ln.retrofitpost.response.DataResponse;
import retrofit2.Response;

/**
 * Created by comp-1 on 8/2/17.
 */

public class DatabaseHandler extends SQLiteOpenHelper{

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 3;

    // Database Name
    private static final String DATABASE_NAME = "PostApi3";

    // Contacts table name
    private static final String TABLE_ORDER = "GET_ORDERS";

    // Contacts Table Columns names
    private static final String ORDER_ID = "OrderID";
    private static final String KEY_TXNID = "Txnid";
    private static final String KEY_PHONE = "Phone";
    private static final String KEY_QUANTITY = "Quantity";
    private static final String KEY_TOTALAMOUNT = "TotalAmount";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_ORDERS_TABLE = "CREATE TABLE " + TABLE_ORDER + "(" +
                ORDER_ID + " INTEGER PRIMARY KEY," +
                KEY_TXNID + " TEXT," +
                KEY_PHONE + " TEXT," +
                KEY_QUANTITY + " INTEGER," +
                KEY_TOTALAMOUNT + " TEXT)";

        db.execSQL(CREATE_ORDERS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ORDER);

        // Create tables again
        onCreate(db);

    }

    public void addOrder(Response<DataResponse> dataResponse) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(ORDER_ID, getCount() + 1);
        values.put(KEY_TXNID, dataResponse.body().getData().get(2).getTxnID());
        values.put(KEY_PHONE, dataResponse.body().getData().get(2).getPhone());
        values.put(KEY_QUANTITY, dataResponse.body().getData().get(2).getQuantity());
        values.put(KEY_TOTALAMOUNT, dataResponse.body().getData().get(2).getTotalAmount());

        db.insert(TABLE_ORDER, null, values);
        db.close();
    }

    public ArrayList<DataResponse.Datum> getOrders(int i)
    {
        SQLiteDatabase dbs = this.getReadableDatabase();
        ArrayList<DataResponse.Datum> dataResponseArrayList = new ArrayList<DataResponse.Datum>();
        DataResponse.Datum dataResponse;
        String selectQuery = "SELECT  * FROM " + TABLE_ORDER +" WHERE " + ORDER_ID + " = " + i;
        Cursor cursor1 = dbs.rawQuery(selectQuery, null);

        if (cursor1.moveToFirst()) {
            do {
                dataResponse = new DataResponse().new Datum();

                dataResponse.setOrderId(Integer.parseInt(cursor1.getString(0)));
                dataResponse.setTxnID(cursor1.getString(1));
                dataResponse.setPhone(cursor1.getString(2));
                dataResponse.setQuantity(cursor1.getString(3));
                dataResponse.setTotalAmount(cursor1.getString(4));

                dataResponseArrayList.add(dataResponse);
            } while (cursor1.moveToNext());
        }

        return dataResponseArrayList;
    }

    public int getCount()
    {

        String countQuery = "SELECT * FROM " + TABLE_ORDER;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
       // cursor.close();

        return cursor.getCount();

    }

}
