package demo

import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import scala.util.Random

class BlinkLEDTest extends AnyFlatSpec with ChiselScalatestTester {
    "BlinkLED Test" should s"work" in {
        test(new BlinkLEDMain.BlinkLED(5)).withAnnotations(Seq(WriteVcdAnnotation)){ dut => 

            for(_ <- 0 until 10){
                dut.clock.step(6)
                println(dut.io.board_led.peek())
            }
            
        }
    }
}
