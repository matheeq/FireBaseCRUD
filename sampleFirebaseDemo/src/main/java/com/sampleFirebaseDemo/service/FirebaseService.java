package com.sampleFirebaseDemo.service;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.sampleFirebaseDemo.model.User;

@Service
public class FirebaseService {
	
	
	public String saveUserDetails(User user) {
		try {
			Firestore dbFirestore = FirestoreClient.getFirestore();
			ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("users").document(user.getName())
					.set(user);
			return "Saved Successfully "+collectionApiFuture.get().getUpdateTime().toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public User getUserDetails(String name) {
		try {
			Firestore dbFirestore = FirestoreClient.getFirestore();
			DocumentReference documentReference = dbFirestore.collection("users").document(name);
			ApiFuture<DocumentSnapshot> future = documentReference.get();
			DocumentSnapshot document = future.get();
			User user = null;
			if (document.exists()) {
				user = document.toObject(User.class);
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String updateUserDetails(User user) {
		try {
			Firestore dbFirestore = FirestoreClient.getFirestore();
			ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("users").document(user.getName())
					.set(user);
			return "Updated Successfully "+collectionApiFuture.get().getUpdateTime().toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String deleteUserDetails(String name) {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> writeResult=dbFirestore.collection("users").document(name).delete();
		return "Document has been Deleted";
	}
}
