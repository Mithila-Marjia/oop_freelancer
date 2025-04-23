package com.example.freelancerproject.DevelopmentManager;

import java.time.LocalDate;

public class ReviewSubmissionMilestones {
    private String descriptin,filename;
    private LocalDate Submissiondate;

    public ReviewSubmissionMilestones(String descriptin, String filename, LocalDate submissiondate) {
        this.descriptin = descriptin;
        this.filename = filename;
        Submissiondate = submissiondate;
    }

    public String getDescriptin() {
        return descriptin;
    }

    public void setDescriptin(String descriptin) {
        this.descriptin = descriptin;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDate getSubmissiondate() {
        return Submissiondate;
    }

    public void setSubmissiondate(LocalDate submissiondate) {
        Submissiondate = submissiondate;
    }

    @Override
    public String toString() {
        return "ReviewSubmissionMilestones{" +
                "descriptin='" + descriptin + '\'' +
                ", filename='" + filename + '\'' +
                ", Submissiondate=" + Submissiondate +
                '}';
    }
}
