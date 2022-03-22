package hicoders.farm.service;

import hicoders.farm.controller.model.WorkerHoursViewModel;

import hicoders.farm.persistency.entity.WorkerHoursEntity;

import java.util.List;

public interface WorkerHoursService {
    WorkerHoursEntity create(WorkerHoursViewModel workerHoursViewModel);

    List<WorkerHoursEntity> getListOfWorkerHours();

    WorkerHoursEntity findWorkerHours(Long id);
    void deleteWorkerHours(Long id);
}
