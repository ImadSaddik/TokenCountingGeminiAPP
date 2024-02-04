package com.example.tokencountinggeminiapp;

public interface ResponseCallback {
    void onResponse(String response);
    void onError(Throwable throwable);
}
