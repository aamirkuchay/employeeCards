package com.cards.Cards.dto;

import javax.validation.constraints.NotBlank;

public class ChangePasswordRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String oldPassword;

    @NotBlank
    private String newPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
