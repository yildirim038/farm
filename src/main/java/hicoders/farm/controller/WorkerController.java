package hicoders.farm.controller;

import hicoders.farm.controller.model.WorkerViewModel;
import hicoders.farm.persistency.entity.WorkerEntity;
import hicoders.farm.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/worker")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WorkerEntity>> getListOfWorker(){
        System.out.println("get list of worker!");

        List<WorkerEntity> workerEntityList = this.workerService.getListOfWorker();
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(workerEntityList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerEntity> getWorkerById(@PathVariable("id") Long id){
        System.out.println("get a worker by his/her id");
        // get info from database
        WorkerEntity existingWorkerEntity = this.workerService.findWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingWorkerEntity);
    }

    @PostMapping
    public ResponseEntity createAWorker(@RequestBody WorkerViewModel workerViewModel){
        System.out.println("create a new Worker" + workerViewModel);
        // save info into database
        WorkerEntity newWorkerEntity = this.workerService.create(workerViewModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWorkerById(@PathVariable("id") Long id){
        System.out.println("delete worker!");
        // delete entity via service from the database
        this.workerService.deleteWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateWorkerById(
            @PathVariable("id") Long id,
            @RequestBody WorkerViewModel workerViewModel
    ){
        System.out.println("replace Worker!");
        // replace the entity in the database

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateWorkerFieldById(
            @PathVariable("id") Long id,
            @RequestBody String firstname
    ){
        System.out.println("replace Worker!");
        // update the entity in the database

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PostMapping("/{id}/register")
    public ResponseEntity registerWorker(
            @RequestBody WorkerViewModel workerViewModel
    ){
        System.out.println("register Worker!");
        // start a new process

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }


}