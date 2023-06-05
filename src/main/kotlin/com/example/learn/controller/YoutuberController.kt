package com.example.learn.controller

import com.example.learn.model.Video
import com.example.learn.model.Youtuber
import com.example.learn.service.VideoService
import com.example.learn.service.YoutuberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/youtubers")
class YoutuberController {

    @Autowired
    lateinit var youtuberService:YoutuberService

    @GetMapping
    fun list (): List<Youtuber>{
        return youtuberService.list()
    }

    @PostMapping
    fun save (@RequestBody youtuber: Youtuber): Youtuber{
        return youtuberService.save(youtuber)
    }
}