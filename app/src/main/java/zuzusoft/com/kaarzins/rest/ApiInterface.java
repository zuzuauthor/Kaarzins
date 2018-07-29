package zuzusoft.com.kaarzins.rest;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/**
 * Created by mukeshnarayan on 08/04/18.
 */

public interface ApiInterface {

  /* @GET
    Call<LoginResponse> onLogin(@Url String url);

    @GET
    Call<MemoriesResponse> getMemoryData(@Url String url);

    @GET
    Call<NotificationResponse> notificationRes(@Url String url);

    @GET
    Call<LoginResponse> sendFollowRequest(@Url String url);

    @FormUrlEncoded
    @POST
    Call<LoginResponse> sendUnfollow(@Url String url, @Field("contact_id") String contact_id, @Field("user_id") String userId, @Field("status_type") String status_type);

    @GET
    Call<ContactResponse> onGetContact(@Url String url);

    @GET
    Call<BondContactResponse> onGetBondContact(@Url String url);

    @GET
    Call<ProfileResponse> onProfileResponse(@Url String url);

    @FormUrlEncoded
    @POST
    Call<LoginResponse> updateUserToken(@Url String url, @Field("token_id") String tokenId, @Field("user_id") String userId);

    @Multipart
    @POST
    Call<LoginResponse> onProfileResponse(@Url String url, @Part MultipartBody.Part image, @Part("name") RequestBody name,
                                          @Part("password") RequestBody password,
                                          @Part("mobile_no") RequestBody mobile_no,
                                          @Part("profile_image") RequestBody profile_image,
                                          @Part("email") RequestBody email,
                                          @Part("nickname") RequestBody nickame,
                                          @Part("flag_name") RequestBody flag_name);

    @FormUrlEncoded
    @POST
    Call<LoginResponse> cancelBondRequestApi(@Url String url, @Field("creater_id") String creater_id, @Field("user_id") String userId, @Field("bond_id") String bond_id);

    *//*

    RequestBody reqUserId = RequestBody.create(MediaType.parse("text/plain"), txtUserId);
        RequestBody reqFollowerId1 = RequestBody.create(MediaType.parse("text/plain"), txtFollowerId1);
        RequestBody reqFollowerId2 = RequestBody.create(MediaType.parse("text/plain"), txtFollowerId2);
        RequestBody reqCategory = RequestBody.create(MediaType.parse("text/plain"), txtCategory);
        RequestBody reqMediaType = RequestBody.create(MediaType.parse("text/plain"), txtMediaType);
        RequestBody reqDuration = RequestBody.create(MediaType.parse("text/plain"), txtDuration);
        RequestBody reqMediaName = RequestBody.create(MediaType.parse("text/plain"), txtMediaName);
        RequestBody reqPublishAfter = RequestBody.create(MediaType.parse("text/plain"), txtPublishAfter);
        RequestBody reqBondingPermission = RequestBody.create(MediaType.parse("text/plain"), txtBondPermission);

        user_id:1
follower_id1:6
follower_id2:7
category:1
media_type:1
duration:0
media_name:index.jpeg
publish_after:1
bond_permission:1

     *//*
    @Multipart
    @POST
    Call<LoginResponse> uploadBondMedia(@Url String url, @Part MultipartBody.Part image, @Part("user_id") RequestBody user_id,
                                        @Part("follower_id1") RequestBody follower_id1,
                                        @Part("follower_id2") RequestBody follower_id2,
                                        @Part("category") RequestBody category,
                                        @Part("media_type") RequestBody media_type,
                                        @Part("duration") RequestBody duration,
                                        @Part("media_name") RequestBody media_name,
                                        @Part("publish_after") RequestBody publish_after,
                                        @Part("bond_permission") RequestBody bond_permission,
                                        @Part MultipartBody.Part thumbmedia,
                                        @Part("thumbnail") RequestBody thumbnail);




    @Multipart
    @POST
    Call<LoginResponse> acceptBondRequest(@Url String url, @Part MultipartBody.Part image, @Part("user_id") RequestBody user_id,
                                          @Part("creater_id") RequestBody creater_id,
                                          @Part("bond_id") RequestBody bond_id,
                                          @Part("media_type") RequestBody media_type,
                                          @Part("media_name") RequestBody media_name,
                                          @Part("duration") RequestBody duration,
                                          @Part("publish_after") RequestBody publish_after,
                                          @Part("bond_permission") RequestBody bond_permission,
                                          @Part("follower_id") RequestBody follower_id);



    @Multipart
    @POST
    Call<LoginResponse> onUpdateProfile(@Url String url, @Part MultipartBody.Part image,
                                        @Part("name") RequestBody name,
                                        @Part("user_id") RequestBody userId,
                                        @Part("profile_image") RequestBody profile_image,
                                        @Part("nickname") RequestBody nickame);
*/


    /*
    @POST("/oauth/v1/access_token")
    @FormUrlEncoded
    Call<TokenResponse> getToken(@Field("client_id") String client_id, @Field("client_secret") String client_secret, @Field("scope") String scope, @Field("grant_type") String grant_type);

    @POST
    @FormUrlEncoded
    Call<String> getTokenScaler(@Url String url, @Field("client_id") String client_id,
                                @Field("client_secret") String client_secret,
                                @Field("grant_type ") String grant_type,
                                @Field("scope ") String scope);

    @POST
    Call<String> getTokenScaler(@Url String url, @Body TokenRequest body);*/


}
