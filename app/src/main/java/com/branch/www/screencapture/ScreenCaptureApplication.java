package com.branch.www.screencapture;

import android.app.Application;
import android.graphics.Bitmap;
import android.widget.Toast;

/**
 * Created by Ryze on 2016-7-20.
 */
public class ScreenCaptureApplication extends Application {


  private Bitmap mScreenCaptureBitmap;

  @Override
  public void onCreate() {
    super.onCreate();
  }


  public Bitmap getmScreenCaptureBitmap() {
    return mScreenCaptureBitmap;
  }

  public void setmScreenCaptureBitmap(Bitmap mScreenCaptureBitmap) {
    this.mScreenCaptureBitmap = mScreenCaptureBitmap;

    Toast.makeText(ScreenCaptureApplication.this,"图片已保存到相册", Toast.LENGTH_SHORT).show();
  }
}
