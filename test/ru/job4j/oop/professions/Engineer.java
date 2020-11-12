package ru.job4j.oop.professions;

import ru.job4j.oop.professions.attributes.Report;

public class Engineer extends Profession {

    private Report report;

    public Report createTechnicalReport() {
        return new Report();
    }
}
