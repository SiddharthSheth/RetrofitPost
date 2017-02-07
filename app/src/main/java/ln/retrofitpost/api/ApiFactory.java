package ln.retrofitpost.api;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by comp-1 on 3/2/17.
 */

public class ApiFactory {

    private static final String API_BASE_URL = " http://bi.way.com/";  // demo server

    private ApiFactory() {
    }

    @NonNull
    private static Retrofit provideRestAdapter() {
        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                /*.client(Application.getInstance().getOkHttpClient())*/
                .build();
    }

    public static <S> S createService(Class<S> serviceClass) {
        return provideRestAdapter().create(serviceClass);
    }

}
