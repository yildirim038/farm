package hicoders.farm.persistency.repository;

import hicoders.farm.persistency.entity.WorkerHoursEntity;
import org.springframework.data.repository.CrudRepository;

public interface WorkerHoursRepository  extends CrudRepository<WorkerHoursEntity, Long> {

}
