package com.atjone.bigdata.spark.SparkCore.value

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark16_intersection {
  def main(args: Array[String]): Unit = {

    //创建SparkContext对象
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("subtractRDD")
    val sc: SparkContext = new SparkContext(conf)

    //从内存中创建对象
    val rdd1: RDD[Int] = sc.parallelize(1 to 5)
    val rdd2: RDD[Int] = sc.parallelize(5 to 10)

    //intersection算子：交集
    val rdd3: RDD[Int] = rdd1.intersection(rdd2)
    rdd3.collect().foreach(println)
  }
}
