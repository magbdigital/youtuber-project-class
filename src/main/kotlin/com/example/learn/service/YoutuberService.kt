package com.example.learn.service

import com.example.learn.model.Video
import com.example.learn.model.Youtuber
import com.example.learn.repository.YoutuberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class YoutuberService {


    @Autowired
    lateinit var youtuberRepository: YoutuberRepository

    fun list(): List<Youtuber> {
       return youtuberRepository.findAll()
    }

    fun save(youtuber: Youtuber): Youtuber {
        return youtuberRepository.save(youtuber)
    }


}