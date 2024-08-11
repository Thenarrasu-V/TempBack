package com.example.demo.service;

import com.example.demo.entities.UserDetailsWithHRManager;
import java.util.List;

public interface UserDetailsWithHRManagerServ {
    /**
     * Fetches the user details by ID.
     * 
     * @param id The ID of the user.
     * @return The user details with the specified ID.
     */
    UserDetailsWithHRManager getUserDetails(Long id);

    /**
     * Adds new user details to the database.
     * 
     * @param userDetails The user details to be added.
     * @return The added user details.
     */
    UserDetailsWithHRManager addUserDetails(UserDetailsWithHRManager userDetails);

    /**
     * Fetches all user details from the database.
     * 
     * @return A list of all user details.
     */
    List<UserDetailsWithHRManager> getAllUserDetails();

    /**
     * Updates existing user details.
     * 
     * @param id The ID of the user to be updated.
     * @param updatedUserDetails The new user details to be updated.
     * @return The updated user details.
     */
    UserDetailsWithHRManager updateUserDetails(Long id, UserDetailsWithHRManager updatedUserDetails);

    /**
     * Deletes user details by ID.
     * 
     * @param id The ID of the user to be deleted.
     */
    void deleteUserDetails(Long id);
}
