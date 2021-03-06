package com.ets.mgl804.data.operations

import org.bdgenomics.formats.avro.Base

/**
 * Created by ikizema on 15-06-09.
 */
object Encoder {
  //  Code :
  //  00	Homozygous for first allele in .bim file
  //  01	Missing genotype
  //  10	Heterozygous
  //  11	Homozygous for second allele in .bim file
  def encodeSPN(variantAlleles : Array[String], sampleSPN : Array[Base]) : Array[Int] = {
    var encodedData = Array(0,0)
    // Data can be A, C, G, T
    if (sampleSPN(0).toString==variantAlleles(0)) {
      encodedData=Array(0,0)
    }
    if (sampleSPN(1).toString==variantAlleles(1)) {
      encodedData=Array(1,1)
    }
    if (sampleSPN(0).toString=="0" && sampleSPN(1).toString=="0") {
      encodedData=Array(0,1)
    }
    if (sampleSPN(0).toString==variantAlleles(0) && sampleSPN(1).toString==variantAlleles(1)) {
      encodedData=Array(1,0)
    }
    return encodedData
  }
}
