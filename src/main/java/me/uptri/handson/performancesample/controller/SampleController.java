package me.uptri.handson.performancesample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.uptri.handson.performancesample.domain.response.PostsResponse;
import me.uptri.handson.performancesample.service.PostService;

@Controller
public class SampleController {
	@Autowired
	private PostService postService;

	@GetMapping(value = "/v1/posts")
	@ResponseBody
	public PostsResponse GetPosts() {
		return this.postService.getPosts();
	}
}
