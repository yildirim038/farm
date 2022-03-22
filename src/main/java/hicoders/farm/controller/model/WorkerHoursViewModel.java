package hicoders.farm.controller.model;

import hicoders.farm.persistency.entity.WorkerEntity;

import javax.persistence.ManyToOne;

public class WorkerHoursViewModel {
    private int weekNumber;
    private Double hour;
    private Long workerId;

    public WorkerHoursViewModel(){};


    public WorkerHoursViewModel(Long workerId, int weekNumber, Double hour) {
        this.workerId = workerId;
        this.weekNumber = weekNumber;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "WorkerHours{" +
                "WorkerId='" + workerId + '\'' +
                ", weekNumber='" + weekNumber + '\'' +
                ", hour='" + hour + '\'' +'}';
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public Long getWorkerHoursEntity() {
        return workerId;
    }


}
