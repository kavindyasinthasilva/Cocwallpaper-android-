package com.kavinduyasintha.cocrealtipsandtrick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.io.IOException;

public class TipsandTrics extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsand_trics);




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {


            }
        });

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.LARGE_BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
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


        Button buttonSetWallpaper = (Button)findViewById(R.id.w1);
        buttonSetWallpaper.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();



                try {
                    myWallpaperManager.setResource(R.drawable.w1);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();


                }
            }
        });

        Button buttonSetWallpaper1 = (Button)findViewById(R.id.w2);
        buttonSetWallpaper1.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.wl2);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Button buttonSetWallpaper2 = (Button)findViewById(R.id.w3);
        buttonSetWallpaper2.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w2);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper3 = (Button)findViewById(R.id.w4);
        buttonSetWallpaper3.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w6);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper4 = (Button)findViewById(R.id.w8);
        buttonSetWallpaper4.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w8);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });



        Button buttonSetWallpaper5 = (Button)findViewById(R.id.w9);
        buttonSetWallpaper5.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w9);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper6 = (Button)findViewById(R.id.w10);
        buttonSetWallpaper6.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w10);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper7 = (Button)findViewById(R.id.w11);
        buttonSetWallpaper7.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w11);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


        Button buttonSetWallpaper8 = (Button)findViewById(R.id.w12);
        buttonSetWallpaper8.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());

                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w12);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });



        Button buttonSetWallpaper9 = (Button)findViewById(R.id.w13);
        buttonSetWallpaper9.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w13);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Button buttonSetWallpaper10 = (Button)findViewById(R.id.w14);
        buttonSetWallpaper10.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(TipsandTrics.this,
                        "Set Wallpaper", Toast.LENGTH_LONG).show();
                try {
                    myWallpaperManager.setResource(R.drawable.w14);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });




    }
}
