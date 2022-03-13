package com.se3.ccms.api;

import com.se3.ccms.models.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {

    //for usercontroller data
    @GET("usercontroller/ccmsuser")
    Call<ArrayList<UserModel>> getAllusercontroller();

    //@GET("user/{id}")
    //Call <UserModel> getSingleUser(@Path("id") int userid);

    @POST("usercontroller/login")
    Call <UserModel> getLoggedUser(@Body UserModel userModel);

    @POST("usercontroller/ccmsuser")
    Call<UserModel> addUser(@Body UserModel userModel);

    @PUT("usercontroller/{id}")
    Call<UserModel> updateUser(@Path("id") int userid, @Body UserModel userModel);

    @DELETE("usercontroller/ccmsuser/{id}")
    Call<UserModel> deleteUser(@Path("id") int userid);

}
