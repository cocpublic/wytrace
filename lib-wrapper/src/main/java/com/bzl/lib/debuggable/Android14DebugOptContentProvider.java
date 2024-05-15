package com.bzl.lib.debuggable;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import com.wy.lib.wytrace.ArtMethodTrace;

public class Android14DebugOptContentProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        Context applicationContext = getContext().getApplicationContext();
        ArtMethodTrace.fix14debugApp(applicationContext);
        Log.d("android14","Android14DebugOptContentProvider onCreate");
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
