package ru.Tyulenev.Entity;

public class Ticket {
    private String ticketId;
    private int visitId;
    private int waitingTime;
    private int totalWaitingTime;
    private int appointmentId;
    private int appointmentTime;
    private int queueId;

    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", visitId=" + visitId +
                ", waitingTime=" + waitingTime +
                ", totalWaitingTime=" + totalWaitingTime +
                ", appointmentId=" + appointmentId +
                ", appointmentTime=" + appointmentTime +
                ", queueId=" + queueId +
                '}';
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTotalWaitingTime() {
        return totalWaitingTime;
    }

    public void setTotalWaitingTime(int totalWaitingTime) {
        this.totalWaitingTime = totalWaitingTime;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(int appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }
}
