package spirals.kotlin_app.Interfaces;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import spirals.kotlin_app.Models.JobOrderListParams;
import spirals.kotlin_app.Models.UserData;


public interface ApiInterface {

    @GET("checkDB.php")
    Call<UserData> getJobOrderList();
}