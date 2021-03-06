package com.ets.mgl804.core.cli

import org.rogach.scallop._
/**
 * Authors: Khaled Ben Ali, Karen Mou Kui, Ivan Kizema
 * Date: 15-06-2015
 * Class declaring all implemented commands
 * See https://github.com/scallop/scallop for more explication about the CLI parser
 */

// List of commands used
class ListCommandsPlink(arguments: Seq[String]) extends ScallopConf(arguments) {

  val file = opt[String](
    "file",
    argName = "name",
    noshort = true,
    descr = "Specify .ped + .map filename prefix (default 'plink')"
  );

  val out = opt[String](
    "out",
    argName = "name",
    noshort = true,
    descr = "Specify the output filename"
  );

  val makeBed  = opt[Boolean](
    "make-bed",
    noshort = true,
    descr = "Create a new binary fileset. Specify .ped and .map files [needs --file and --out]"
  );

  val genome = opt[Boolean](
    "genome",
     noshort = true,
     descr = "Calculate IBS distances between all individuals [needs --file and --out]"
  );

//  val readGenome = opt[Boolean](
//    "read-genome",
//    noshort = true,
//    descr = "Command can directly read compressed file"
//  );

  val showParquet = opt[Boolean](
    "show-parquet",
    noshort = true,
    descr = "Show shema and data sample ostored in a parquet file [needs --file]"
  );

//  val cluster = opt[Boolean](
//    "cluster",
//    noshort = true,
//    descr = "Cluster samples using a pairwise similarity statistic (normally IBS)"
//  );

  val help = opt[Int](
    "help",
    short = 'h',
    descr = "Show help message"
  );
}