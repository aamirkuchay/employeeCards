package com.cards.Cards.controller;


import com.cards.Cards.dto.ChangePasswordRequest;
import com.cards.Cards.dto.ResponseMessage;
import com.cards.Cards.dto.UpdateUserRequest;
import com.cards.Cards.entity.User;
import com.cards.Cards.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AuthenticationService authenticationService;


    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest updateUserRequest) {
        return ResponseEntity.ok(authenticationService.updateUser(id, updateUserRequest));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(authenticationService.getUserById(id));
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public Page<User> findAllByPage(@RequestParam(defaultValue = "1") int page) {
        Pageable pageable = PageRequest.of(page - 1, 10);
        return authenticationService.findAllByPage(pageable);
    }

    @PreAuthorize("#username == authentication.principal.username")
    @PostMapping("/change-password")
    public ResponseEntity<ResponseMessage> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        authenticationService.changePassword(changePasswordRequest.getUsername(),
                changePasswordRequest.getOldPassword(),
                changePasswordRequest.getNewPassword());
        return ResponseEntity.ok(new ResponseMessage("Password changed successfully"));
    }

}

