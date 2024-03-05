package demo

import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import scala.util.Random

class SwitchToLEDTest extends AnyFlatSpec with ChiselScalatestTester {
    "SwitchToLED Test" should s"work" in {
        test(new SwitchToLEDMain.SwitchToLED).withAnnotations(Seq(WriteVcdAnnotation)){ dut => 
            dut.io.board_sw.poke(1.U)
            dut.clock.step(1)
            dut.io.board_sw.poke(0.U)
            dut.clock.step(1)
            dut.io.board_sw.poke(1.U)
            dut.clock.step(3)
            dut.io.board_sw.poke(0.U)
            dut.clock.step(3)


        }
    }
}
