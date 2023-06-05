package com.example.learn.service

import com.example.learn.model.Video
import com.example.learn.model.Youtuber
import com.example.learn.repository.VideoRepository
import com.example.learn.repository.YoutuberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class VideoService {

    @Autowired
    lateinit var videoRepository: VideoRepository

    @Autowired
    lateinit var youtuberRepository: YoutuberRepository

    val fairPlayInit=100

    fun list(): List<Video> {
        return videoRepository.findAll()
    }

    fun save(video: Video): Video {
        try{
        val response = videoRepository.save(video)

        val totalVideos= videoRepository.getTotalVideos(video.youtuberId)
        val youtuber = youtuberRepository.findById(video.youtuberId)  ?: throw Exception("ID no existe")



        return response
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}