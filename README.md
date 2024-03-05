# Chisel Vivado Demo Repository

This repo holds some simple test code to get you started with your development board. For now, there is nothing to complete, just run the code to generate SystemVerilog files to run in Vivado to generate a .bit file. Remember, there is a video on canvas walking through this process.

**Getting the Repo:**
```bash
$ https://github.com/ebiernacki/chisel-vivado-demo.git 
```

**Testing the Examples**
- To test the BlinkLED Module:
    ```bash
    sbt
    testOnly demo.BlinkLEDTest
    ```
- replace ```BlinkLEDTest``` with the name of the test you want to run

- To run the BlinkLED Module:
    ```bash
    sbt
    runMain demo.BlinkLEDMain
    ```


## External Setup Guides and Running the Projects

- [Java, Sbt and Chisel Guide](https://docs.google.com/document/d/13pX-4cFuGuj_i7VRhmksyf7YL6-qXiF8-O9J9m_yVfI/edit?usp=sharing)
- [GTKWave Guide](https://docs.google.com/document/d/1-muYy8XSGP4EbMIbLuwTEscIj1UC-u8HU5glcBpIFUo/edit?usp=sharing)
- [Vivado Guide](https://docs.google.com/document/d/1O-y1rnS1V_Bjyc2GwYd9C6Gq1IsqVcxacy2lTD6tHME/edit?usp=sharing)





