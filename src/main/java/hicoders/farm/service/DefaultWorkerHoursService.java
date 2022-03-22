package hicoders.farm.service;

import hicoders.farm.controller.model.WorkerHoursViewModel;
import hicoders.farm.persistency.entity.WorkerHoursEntity;
import hicoders.farm.persistency.repository.WorkerHoursRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultWorkerHoursService implements WorkerHoursService {
        private final WorkerHoursRepository workerHoursRepository;
        public DefaultWorkerHoursService (WorkerHoursRepository repository){this.workerHoursRepository= repository;}


    @Override
    public WorkerHoursEntity create(WorkerHoursViewModel workerHoursViewModel) {
        return this.workerHoursRepository
                .save(new WorkerHoursEntity(workerHoursViewModel.getWorkerHoursEntity(),
                        workerHoursViewModel.getWeekNumber(),
                        workerHoursViewModel.getHour()));
    }

    @Override
    public List<WorkerHoursEntity> getListOfWorkerHours() {
        return (List<WorkerHoursEntity>) this.workerHoursRepository.findAll();
    }
    @Override
    public WorkerHoursEntity findWorkerHours(Long id) {
        return this.workerHoursRepository.findById(id).get();
    }

    @Override
    public void deleteWorkerHours(Long id) {
        this.workerHoursRepository.deleteById(id);
    }
}
