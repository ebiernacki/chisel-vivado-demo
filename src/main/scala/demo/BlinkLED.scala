package demo

import chisel3._
import chisel3.stage._

object BlinkLEDMain extends App{
    class BlinkLED(frequency: Int) extends Module {
        val io = IO(new Bundle {
            val board_led = Output(UInt(1.W))
        })
        
        val CNT_MAX = (frequency - 1).U

        val cntReg = RegInit(0.U(32.W))
        val blkReg = RegInit(0.U(1.W))

        cntReg := cntReg + 1.U

        //count up to CNT_MAX and then reset the counter and toggle the LED
        when(cntReg === CNT_MAX) {
            cntReg := 0.U
            blkReg := ~blkReg
        }

        io.board_led := blkReg  
    }


    new circt.stage.ChiselStage().execute(args,Seq(circt.stage.CIRCTTargetAnnotation(circt.stage.CIRCTTarget.SystemVerilog), ChiselGeneratorAnnotation(() => new BlinkLED(100000000))))

}