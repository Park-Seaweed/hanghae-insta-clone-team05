package com.project.instagramcloneteam5.controller;

import com.project.instagramcloneteam5.response.Response;
import com.project.instagramcloneteam5.service.MemberService;
import com.project.instagramcloneteam5.service.TestMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TestUserController {

    private final TestMemberService testMemberService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users")
    public Response findAllUsers() {
        return Response.success(testMemberService.findAllUsers());
    }
}