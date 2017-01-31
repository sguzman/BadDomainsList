package io.initialcommit.sguzman.upwork.bad.domain

import scala.io.Source

object Bad {
  def main(args: Array[String]): Unit = {
    println(Source.fromFile("/Users/salvadorguzman/Software/BadDomainsList/src/main/resources/bad-domains.txt"))
  }
}
