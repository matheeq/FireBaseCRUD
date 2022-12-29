package com.sampleFirebaseDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
public class SampleFirebaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleFirebaseDemoApplication.class, args);
		/*
		 * try { ClassLoader classLoader =
		 * SampleFirebaseDemoApplication.class.getClassLoader(); File file = new
		 * File(Objects.requireNonNull(classLoader.getResource("demoServiceAccount.json"
		 * )).getFile()); FileInputStream serviceAccount = new
		 * FileInputStream(file.getAbsolutePath());
		 * 
		 * FirebaseOptions options = new FirebaseOptions.Builder()
		 * .setCredentials(GoogleCredentials.fromStream(serviceAccount))
		 * .setDatabaseUrl("https://demoproject-50018-default-rtdb.firebaseio.com").
		 * build();
		 * 
		 * FirebaseApp.initializeApp(options); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
	}

}
