package ln.retrofitpost.service;

import ln.retrofitpost.request.DataRequest;
import ln.retrofitpost.response.DataResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by comp-1 on 3/2/17.
 */

public interface DataService {

    @POST("responsive/mobiwebservice/api/get_orders.php")
    Call<DataResponse> getResult(@Body DataRequest dataRequest);

}
