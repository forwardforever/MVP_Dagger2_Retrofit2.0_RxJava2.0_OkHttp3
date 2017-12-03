package com.bwei.frame;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/12/3 13:09
 */


public interface ApiService {
    //searchProducts?keywords=笔记本&page=1
    @GET("searchProducts")
    Flowable<Infos> getData(@Query("keywords") String keywords, @Query("page") int page, @Query("source") String source);

    @GET("categories")
    Flowable<List<ShowInfo>> getData(@Query("udid") String udid, @Query("vc") int vc);
}
