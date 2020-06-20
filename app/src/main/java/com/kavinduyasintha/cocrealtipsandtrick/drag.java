package com.kavinduyasintha.cocrealtipsandtrick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.io.IOException;

@SuppressWarnings("ALL")
public class drag extends AppCompatActivity {
    private AdView mAdView;
    public View view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);


        MobileAds.initialize(this, "ca-app-pub-4219956547028494~5080484131");

        //   --- Admob ---
        view1=getWindow().getDecorView().getRootView();

        Admob.createLoadBanner(getApplicationContext(), view1);
        Admob.createLoadInterstitial(getApplicationContext(),null);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {


            }
        });

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.LARGE_BANNER);
        adView.setAdUnitId("ca-app-pub-4219956547028494~5080484131");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });



        Button buttonSetWallpaper = (Button)findViewById(R.id.d1);
        buttonSetWallpaper.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();



                try {
                    myWallpaperManager.setResource(R.drawable.d2);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();


                }
            }
        });

        Button buttonSetWallpaper1 = (Button)findViewById(R.id.d2);
        buttonSetWallpaper1.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d3);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Button buttonSetWallpaper2 = (Button)findViewById(R.id.d3);
        buttonSetWallpaper2.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d4);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper3 = (Button)findViewById(R.id.d4);
        buttonSetWallpaper3.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d5);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper4 = (Button)findViewById(R.id.d8);
        buttonSetWallpaper4.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d6);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });



        Button buttonSetWallpaper5 = (Button)findViewById(R.id.d9);
        buttonSetWallpaper5.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d6);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper6 = (Button)findViewById(R.id.d10);
        buttonSetWallpaper6.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d7);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper7 = (Button)findViewById(R.id.d11);
        buttonSetWallpaper7.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(drag.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.d8);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


    }
}
