package com.example.learn.controller

import com.example.learn.model.Video
import com.example.learn.service.VideoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/videos")
class VideoController {
    @Autowired
    lateinit var videoService:VideoService

    @GetMapping
    fun list (): List<Video>{
        return videoService.list()
    }

    @PostMapping
    fun save (@RequestBody video: Video):ResponseEntity<Video>{
        return ResponseEntity(videoService.save(video), HttpStatus.OK)
    }
}