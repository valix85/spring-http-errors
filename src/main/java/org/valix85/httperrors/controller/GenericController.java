package org.valix85.httperrors.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.valix85.httperrors.dto.SimpleResponse;

@CrossOrigin
@Controller
@RequestMapping("/api")
public class GenericController {

    @GetMapping("/{num}")
    public ResponseEntity getByCodeGET(@PathVariable("num") String num){
        return new ResponseEntity(new SimpleResponse(Integer.parseInt(num)), HttpStatus.valueOf(Integer.parseInt(num)));
    }

    @PostMapping("/{num}")
    public ResponseEntity getByCodePOST(@PathVariable("num") String num){
        return new ResponseEntity(new SimpleResponse(Integer.parseInt(num)), HttpStatus.valueOf(Integer.parseInt(num)));
    }

    @PutMapping("/{num}")
    public ResponseEntity getByCodePUT(@PathVariable("num") String num){
        return new ResponseEntity(new SimpleResponse(Integer.parseInt(num)), HttpStatus.valueOf(Integer.parseInt(num)));
    }

    @PatchMapping("/{num}")
    public ResponseEntity getByCodePATCH(@PathVariable("num") String num){
        return new ResponseEntity(new SimpleResponse(Integer.parseInt(num)), HttpStatus.valueOf(Integer.parseInt(num)));
    }

    @DeleteMapping("/{num}")
    public ResponseEntity getByCodeDELETE(@PathVariable("num") String num){
        return new ResponseEntity(new SimpleResponse(Integer.parseInt(num)), HttpStatus.valueOf(Integer.parseInt(num)));
    }

}
