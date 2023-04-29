package com.blogging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.dto.ApiResponse;
import com.blogging.dto.PostDto;
import com.blogging.exception.CategoryNotFoundException;
import com.blogging.exception.PostNotFoundException;
import com.blogging.exception.UserNotFoundException;
import com.blogging.service.PostService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/blog")
public class PostController {

	@Autowired
	private PostService postService;
	
	
	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createNewPost(@RequestBody PostDto postDto,
			@PathVariable("userId") Long userId,
			@PathVariable("categoryId") Long categoryId
			)throws UserNotFoundException ,CategoryNotFoundException
	{
		
		return new ResponseEntity<PostDto>(postService.createNewPost(postDto, userId, categoryId),HttpStatus.CREATED);
	}
	
	
	@PutMapping("/post/{postId}")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable("postId") Long postId)
	throws PostNotFoundException{
		return new ResponseEntity<PostDto>(postService.updatePost(postDto, postId),HttpStatus.OK);
	}
	
	
	@GetMapping("/post/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable("postId") Long postId)
			throws PostNotFoundException{
		
		return new ResponseEntity<PostDto>(postService.findPostById(postId),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/post/{postId}")
	public ResponseEntity<?> deletePostById(@PathVariable("postId") Long postId)
			throws PostNotFoundException{
		postService.deletePost(postId);
		
		return new ResponseEntity<>(new ApiResponse("post Deleted successfully",false), HttpStatus.OK);
	
	}
	
	@GetMapping("/allposts/")
	public ResponseEntity<List<PostDto>> getAllPost(){
		
		return new ResponseEntity<List<PostDto>>(postService.findAllPost(),HttpStatus.ACCEPTED);
	}
}