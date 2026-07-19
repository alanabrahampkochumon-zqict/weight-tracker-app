package com.cs360.weighttracker.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


/**
 * Model representing a user.
 */
public class User {

    String username;
    String password;


    /**
     * Constructs a username and password
     *
     * @param username The user's username
     * @param password The user's password
     * @apiNote Passwords must not be stored in plain text.
     * Use helper provided in `PasswordHasher` to hash the password for storage.
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    /**
     * Compare if the given object and current instance are equal
     *
     * @param obj The object to compare current instance against.
     * @return True if all the properties of current object match the given object.
     */
    @Override
    public boolean equals(@Nullable Object obj) {
        // If object is not an instance of user return false
        if (!(obj instanceof User)) return false;

        // If they are equal then compare their username and password
        User user = (User) obj;
        return this.username.equals(user.username) && this.password.equals(user.password);
    }

    /**
     * Returns a string representation of current object.
     *
     * @return A string representation of the current user.
     * @apiNote Password is omitted.
     */
    @NonNull
    @Override
    public String toString() {
        return "Username = " + username;
    }
}
