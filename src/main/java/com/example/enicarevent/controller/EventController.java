package com.example.enicarevent.controller;

import com.example.enicarevent.model.Evenement;
import com.example.enicarevent.model.Utilisateur;
import com.example.enicarevent.service.EventService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/Event")
@CrossOrigin
public class EventController {
@Autowired
    private EventService eventservice;

    @PostMapping("/add")
    public String add(@RequestBody Evenement evenement) {
        eventservice.saveEvenement(evenement);
        return "new evenement added";
    }


    @RequestMapping(value = "/image/{eventId}",method= RequestMethod.GET,produces = MediaType.IMAGE_JPEG_VALUE)
    public void  getImage(@PathVariable("eventId") int eventId, HttpServletResponse response) throws IOException {
            Evenement event = eventservice.getEventById(eventId);

        File imgFile = new File("event-photos/"+eventId+"/"+event.getPathImage());
        byte[] bytes = Files.readAllBytes(imgFile.toPath());

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(bytes, response.getOutputStream());
        }


    @RequestMapping(path = "/add/multipart", method = RequestMethod.POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public String saveEmployee(Evenement evenement, @RequestPart("image") MultipartFile document) throws IOException {
        String fileName = StringUtils.cleanPath(document.getOriginalFilename());
        evenement.setPathImage(fileName);
        Evenement savedEvent =  eventservice.saveEvenement(evenement);
        String uploadDir = "event-photos/" + savedEvent.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, document);

        return "new evenement added";
    }
    @GetMapping("getAll")
    public List<Evenement> getAllevent() {
         return eventservice.getEvents();
    }

    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable int id)
    {
        return eventservice.deleteEvent(id);

    }
}
