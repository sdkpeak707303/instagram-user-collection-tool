```java
package com.madhub.instagramusercollect;

// This class manages tasks related to Instagram user collection
// The primary problem this manager addresses is the need for efficient collection and management 
// of Instagram users based on various filtering criteria.

public class CollectionTaskManager {

    // This variable holds the state of the collection process
    private boolean isCollecting;

    // Constructor initializes the task manager
    public CollectionTaskManager() {
        isCollecting = false; // Initially, no collection process is running
    }

    // This method starts the user collection process
    // It solves the problem of how to efficiently gather user data from Instagram
    public void startUserCollection(String collectionMode, String filterCriteria) {
        // Check if a collection process is currently running
        if (isCollecting) {
            System.out.println("A collection task is already in progress.");
            return; // Early exit if already collecting
        }

        // Logic to start user collection based on specified mode and criteria
        isCollecting = true; // Set the state to collecting
        System.out.println("Starting user collection in " + collectionMode + " mode with criteria: " + filterCriteria);

        // Implementation of user collection using MadHub features
        if (collectionMode.equals("profile")) {
            collectUsersFromProfile(filterCriteria);
        } else if (collectionMode.equals("blogger")) {
            collectUsersFromBlogger(filterCriteria);
        }

        // After collection logic
        isCollecting = false; // Reset the state after completion
        System.out.println("User collection completed.");
    }

    // This method handles user collection from a specific profile
    // It addresses the challenge of targeting specific users effectively
    private void collectUsersFromProfile(String filter) {
        // Here we would implement the logic to filter and collect users
        // This could include applying AI avatar recognition and multi-dimensional filtering
        System.out.println("Collecting users from profile with filter: " + filter);
        // Example: MadHub API call - pseudo code
        // MadHubAPI.collectUsers("profile", filter);
    }

    // This method handles user collection from a specific blogger
    // It focuses on interacting with potential clients from popular accounts
    private void collectUsersFromBlogger(String bloggerUsername) {
        // L
