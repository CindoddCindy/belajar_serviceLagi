package foodinger.project.testservislagi.retrofit;

/*
import geekgarden.zonamitraproject.zonamitra.model.LoginRespon;
import geekgarden.zonamitraproject.zonamitra.model.ResponBtnTerimaOrder;
import geekgarden.zonamitraproject.zonamitra.model.ResponCancelOrder;
import geekgarden.zonamitraproject.zonamitra.model.ResponFinishOrder;
import geekgarden.zonamitraproject.zonamitra.model.ResponGetDataUSer;
import geekgarden.zonamitraproject.zonamitra.model.ResponTerimaOrder;
import geekgarden.zonamitraproject.zonamitra.model.ResponseOrderList;

 */
import foodinger.project.testservislagi.pojo.ResponGetDataUSer;
import retrofit2.Call;
        import retrofit2.http.GET;

public interface RetrofitMethod {
/*
    @FormUrlEncoded
    @POST("auth/login")
    Call<LoginRespon> getUserToken(@Field("user_email") String user_email, @Field("user_pass") String user_pass);

    @Headers({"Accept: application/json"})
    @GET("auth/getuser")
    Call<ResponGetDataUSer> getUser(@HeaderMap Map<String, String> Map);

    @GET("order-history/{id}")
    Call<List<ResponseOrderList>> getDataList(@Path("id") long id);

 */

    @GET("latest-order")
    Call<ResponGetDataUSer> getOrder();
/*
    @FormUrlEncoded
    @POST("order-create")
    Call<ResponBtnTerimaOrder> getTerimaOrder(@Field("user_id") long user_id, @Field("post_id") long post_id);


    @FormUrlEncoded
    @POST("order-finish/")
    Call<ResponFinishOrder> finishOrderResponse(@Field("post_id ") long post_id);

    @FormUrlEncoded
    @POST("order-cancel")
    Call<ResponCancelOrder> cancelOrder(@Field("post_id ") long post_id);



 */

}
