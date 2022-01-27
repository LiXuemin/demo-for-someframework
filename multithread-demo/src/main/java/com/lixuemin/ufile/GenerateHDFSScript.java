package com.lixuemin.ufile;

import cn.hutool.core.io.file.FileWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 **/
public class GenerateHDFSScript {
    private static String s1 = "hadoop fs -cat /ods/events/beiwaiclass/%s/*.log | hadoop fs -put - /ods/events/beiwaiclass/%s/merge_files";
    private static String s2 = "hadoop fs -rm -r /ods/events/beiwaiclass/%s/*.log";
    private static String s3 = "hadoop fs -cat /ods/events/icourse_study.aoll.tag/%s/*.log | hadoop fs -put - /ods/events/icourse_study.aoll.tag/%s/merge_files";
    private static String s4 = "hadoop fs -rm -r /ods/events/icourse_study.aoll.tag/%s/*.log";
    private static String s5 = "hadoop fs -cat /ods/events/icourse_study_duration.aoll.duration/%s/*.log | hadoop fs -put - /ods/events/icourse_study_duration.aoll.duration/%s/merge_files";
    private static String s6 = "hadoop fs -rm -r /ods/events/icourse_study_duration.aoll.duration/%s/*.log";
    private static String s7 = "hadoop fs -cat /ods/events/icourse_study_pagestay.aoll.pagestay/%s/*.log | hadoop fs -put - /ods/events/icourse_study_pagestay.aoll.pagestay/%s/merge_files";
    private static String s8 = "hadoop fs -rm -r /ods/events/icourse_study_pagestay.aoll.pagestay/%s/*.log";

    public static void main(String[] args) {

        FileWriter writer = new FileWriter("F:\\test.txt");

        LocalDate start = LocalDate.parse("2021-08-19");
        LocalDate end = LocalDate.parse("2022-01-17");
        final List<LocalDate> dates = collectLocalDates(start, end);
        List<String> lines = new ArrayList<>();
        for (LocalDate date : dates) {
            lines.add("#" +date);
            lines.add(String.format(s1, date, date));
            lines.add(String.format(s2, date));
            lines.add(String.format(s3, date, date));
            lines.add(String.format(s4, date));
            lines.add(String.format(s5, date, date));
            lines.add(String.format(s6, date));
            lines.add(String.format(s7, date, date));
            lines.add(String.format(s8, date));
        }
        writer.writeLines(lines, true);
    }

    public static List<LocalDate> collectLocalDates(LocalDate start, LocalDate end) {
        return Stream.iterate(start, localDate -> localDate.plusDays(1))
            .limit(ChronoUnit.DAYS.between(start, end) + 1)
            .collect(Collectors.toList());
    }
}
