package demo


import chisel3._
import chisel3.stage._

object SwitchToLEDMain extends App{
    class SwitchToLED extends Module{
        val io = IO(new Bundle {
            val board_sw = Input(UInt(5.W)) // set 5 switches 
            val board_led = Output(UInt(5.W))// to 5 LEDs
        })

        io.board_led := io.board_sw
    }

    new circt.stage.ChiselStage().execute(args,Seq(circt.stage.CIRCTTargetAnnotation(circt.stage.CIRCTTarget.SystemVerilog), ChiselGeneratorAnnotation(() => new SwitchToLED)))
}
