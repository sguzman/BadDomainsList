package io.initialcommit.sguzman.upwork.bad.domain

import com.mashape.unirest.http.Unirest

import scala.io.Source

object Bad {
  def main(args: Array[String]): Unit = {
    val domains = "/Users/salvadorguzman/Software/BadDomainsList/src/main/resources/bad-domains.txt"
    (for(line <- Source.fromFile(domains).getLines)  yield line)
      .map(Unirest.get(_).asString.getBody)
      .filter(!_.startsWith("#")).toArray.sortWith(_ < _).distinct
      .foreach(println)
  }
}
