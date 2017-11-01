Kotlin + TornadoFX + Dagger2
---------------------------

**What?**

A simple example on how to combine the three technologies. Uses the user's guide example of Dagger 2, namely coffee 
brewing, and adds a tornadoFX UI on top of it. Furthermore it makes sure to use Dagger 2 as DI  framework for the handling of the UI as well.

**Why?**

- We don't want to use  tornadofx's own DI, as Dagger2 just 
plays in its own league.
- Hooray for compile time DI + TornadoFX.
- It works like a charm in one of our projects.

**How?**
```
gradle run
```