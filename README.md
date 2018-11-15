## Running

Run this using [sbt](http://www.scala-sbt.org/). 

```
sbt run
```

## Indexing

In case that there are errors while indexing the project and you have error in intellij like `cannot resolve symbol xyz` try executing this on the command line if you are on windows
```
gradlew.bat cleanIdea idea ideaModule
```
and in case that you are using linux 
```
./gradlew cleanIdea idea ideaModule
```

Then press on the project viewer, in case that there are still errors try to run the commands again. The intellij window should be like this.

[Sample project structure](doc/images/project_structure.png)
