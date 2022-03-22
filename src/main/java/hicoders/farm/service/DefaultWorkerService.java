package hicoders.farm.service;

import hicoders.farm.controller.model.WorkerViewModel;
import hicoders.farm.persistency.entity.WorkerEntity;
import hicoders.farm.persistency.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultWorkerService implements WorkerService {
    private final WorkerRepository workerRepository;
    public DefaultWorkerService (WorkerRepository repository){this.workerRepository= repository;}

    @Override
    public WorkerEntity create(WorkerViewModel workerViewModel) {
        return this.workerRepository
                .save(new WorkerEntity(workerViewModel.getFirstName(),
                        workerViewModel.getLastName(),
                        workerViewModel.getType()));
    }

    @Override
    public WorkerEntity findWorker(Long id) {
        return this.workerRepository.findById(id).get();
    }

    @Override
    public List<WorkerEntity> getListOfWorker() {
        return (List<WorkerEntity>) this.workerRepository.findAll();
    }

    @Override
    public void deleteWorker(Long id) {
        this.workerRepository.deleteById(id);
    }
}
