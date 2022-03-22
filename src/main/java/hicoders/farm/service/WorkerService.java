package hicoders.farm.service;

import hicoders.farm.controller.model.WorkerViewModel;
import hicoders.farm.persistency.entity.WorkerEntity;

import java.util.List;

public interface WorkerService {
    WorkerEntity create(WorkerViewModel workerViewModel);

    WorkerEntity findWorker(Long id);

    List<WorkerEntity> getListOfWorker();

    void deleteWorker(Long id);
}
