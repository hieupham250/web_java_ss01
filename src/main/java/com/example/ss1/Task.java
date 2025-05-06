package com.example.ss1;

public class Task {
    private String jobName;
    private boolean status;

    public Task(String jobName) {
        this.jobName = jobName;
        this.status = false;
    }

    public String getJobName() {
        return jobName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
