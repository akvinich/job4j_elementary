package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Петров Игорь Андреевич");
        student.setGroup("ЭМ-51");
        student.setAdmissionDate(new Date(120, Calendar.SEPTEMBER, 1));
        String formatData = new SimpleDateFormat("MM-dd-yyyy").format(student.getAdmissionDate());

        System.out.println("Студент " + student.getFullName() + ", поступивший "
                + formatData + ", зачислен в группу " + student.getGroup());
    }
}
