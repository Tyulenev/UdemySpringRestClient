package ru.Tyulenev.Entity;

public class Queues {
    private int     id;
    private String  name;
    private String  queueType;
    private int     customersWaiting;
    private int     waitingTime;
    private int     serviceLevel;

    public Queues() {
    }

    @Override
    public String toString() {
        return "Queues{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", queueType='" + queueType + '\'' +
                ", customersWaiting=" + customersWaiting +
                ", waitingTime=" + waitingTime +
                ", serviceLevel=" + serviceLevel +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public int getCustomersWaiting() {
        return customersWaiting;
    }

    public void setCustomersWaiting(int customersWaiting) {
        this.customersWaiting = customersWaiting;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(int serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}
