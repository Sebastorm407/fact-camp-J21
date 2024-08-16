package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Client;
import org.bcamp.crud.factcampesino.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientRest {

    @Autowired
    private ClientService clientService;

    @GetMapping
    private ResponseEntity<List<Client>> getAllClient(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping
    private ResponseEntity<Client> saveClient(@RequestBody Client client){
        try{
            Client clientSave = clientService.save(client);
            return ResponseEntity.created(new URI("/client"+clientSave.getId())).body(clientSave);
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
