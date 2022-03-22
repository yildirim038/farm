package hicoders.farm.persistency.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class WorkerHoursEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private int weekNumber;

        private Double hour;

        private Long workerId;

        public WorkerHoursEntity(){};

        public WorkerHoursEntity(Long workerId, int weekNumber, Double hour) {
            this.workerId = workerId;
            this.weekNumber = weekNumber;
            this.hour = hour;
        }
}

