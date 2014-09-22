package com.jannahapps.holycitieslive;

import com.jannahapps.holycitieslive.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
			
			public void meccaClick(View v) {
				String video_path = "http://www.youtube.com/watch?v=9qJRP_Lh03k";
				Uri uri = Uri.parse(video_path);
				uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		
			public void madinaClick(View v) {
				String video_path = "http://www.youtube.com/watch?v=Piw_wA8AIOc";
				Uri uri = Uri.parse(video_path);
				uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}

}

