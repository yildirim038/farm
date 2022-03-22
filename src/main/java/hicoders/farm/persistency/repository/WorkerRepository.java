package hicoders.farm.persistency.repository;

import hicoders.farm.persistency.entity.WorkerEntity;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<WorkerEntity, Long> {

}

