# demo-java-modular

```
$javac -d module/demo.module.calculator  src/demo.module.calculator/module-info.java src/demo.module.calculator/demo/module/calculator/Calculator.java
$javac --module-path module -d module/demo.hellomodule   src/demo.hellomodule/module-info.java src/demo.hellomodule/demo/hellomodule/Main.java
$java --module-path module -m demo.hellomodule/demo.hellomodule.Main
```
