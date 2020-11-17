package ru.job4j.profession.medicine;

import ru.job4j.profession.Profession;
import ru.job4j.profession.client.Pacient;
import ru.job4j.profession.medicine.treatment.Diagnosis;
import ru.job4j.profession.medicine.treatment.Prescription;

public class Doctor extends Profession {
    private int workExperience;
    private String addEducation;
    private int rating;

    public int getWorkExperience() {
        return workExperience;
    }

    public String getAddEducation() {
        return addEducation;
    }

    public int getRating() {
        return rating;
    }

    public Diagnosis diagnose(Pacient pacient) {
        return new Diagnosis();
    }

    public Prescription givePrescription(Diagnosis diagnosis) {
        return new Prescription();
    }
}
