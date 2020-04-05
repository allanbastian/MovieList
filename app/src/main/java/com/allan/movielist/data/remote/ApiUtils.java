package com.allan.movielist.data.remote;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://www.hoblist/";

    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
