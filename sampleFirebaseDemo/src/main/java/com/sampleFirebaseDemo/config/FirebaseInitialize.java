package com.sampleFirebaseDemo.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitialize {

	@PostConstruct
	public void initialize() {

		try {

			FileInputStream serviceAccount = new FileInputStream("./sampleprojectFireStore.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

			FirebaseApp.initializeApp(options);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
