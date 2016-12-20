Info
====

This is a simple project trying to combine 3 languages. You can compile, package and run it to see that it is possible, at least to some extent.
However the solution is not stable and clean and not recommended in commercial projects, as it surely does not cover all cases one would encounter
with such a setup.

See [this discussion](https://discuss.gradle.org/t/is-it-possible-to-have-java-groovy-scala-polyglot-project-and-have-it-compiled-via-gradle/7210/4)
for more details.

Compile & package
=================

    ./mvn clean package

Running
=======

    java -jar target/polyglot-0.0.1-SNAPSHOT-jar-with-dependencies.jar

Expected result:

    MyJavaClass x = 1
    From MyGroovyClass x = 6
    From MyScalaClass x = 6
    MyGroovyClass x = 2
    From MyJavaClass x = 7
    From MyScalaClass x = 7
    MyScalaClass x = 3
    From MyJavaClass x = 8
    From MyGroovyClass x = 8
