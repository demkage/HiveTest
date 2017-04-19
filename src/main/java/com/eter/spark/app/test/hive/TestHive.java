package com.eter.spark.app.test.hive;

import org.apache.spark.sql.SparkSession;

/**
 * Created by abosii on 4/19/2017.
 */
public class TestHive {
    public static void main(String[] args) {
        SparkSession session = SparkSession.builder()
                    .appName("TestHive")
                    .enableHiveSupport()
                    .getOrCreate();

        session.sql("SELECT * FROM testtable").show();
    }
}
