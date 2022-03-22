package hicoders.farm.controller;

import hicoders.farm.controller.model.WorkerHoursViewModel;
import hicoders.farm.persistency.entity.WorkerHoursEntity;
import hicoders.farm.service.WorkerHoursService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker-hours")
public class WorkerHoursController {
    private final WorkerHoursService workerHoursService;

    public WorkerHoursController(WorkerHoursService workerHoursService) {
        this.workerHoursService = workerHoursService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WorkerHoursEntity>> getListOfWorkerHours(){
        System.out.println("get list of worker!");

        List<WorkerHoursEntity> workerHoursEntityList = this.workerHoursService.getListOfWorkerHours();
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(workerHoursEntityList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerHoursEntity> getWorkerHoursById(@PathVariable("id") Long id){
        System.out.println("get a worker hours by his/her id");
        // get info from database
        WorkerHoursEntity existingWorkerHoursEntity = this.workerHoursService.findWorkerHours(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingWorkerHoursEntity);
    }

    @PostMapping
    public ResponseEntity createAWorkerHours(@RequestBody WorkerHoursViewModel workerHoursViewModel){
        System.out.println("create a new Worker Hours" + workerHoursViewModel);
        // save info into database
        WorkerHoursEntity newWorkerHoursEntity = this.workerHoursService.create(workerHoursViewModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newWorkerHoursEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWorkerHoursById(@PathVariable("id") Long id){
        System.out.println("delete Worker Hours!");
        // delete entity via service from the database
        this.workerHoursService.deleteWorkerHours(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateWorkerHoursById(
            @PathVariable("id") Long id,
            @RequestBody WorkerHoursViewModel workerHoursViewModel
    ){
        System.out.println("replace Worker Hours!");
        // replace the entity in the database

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }


}
