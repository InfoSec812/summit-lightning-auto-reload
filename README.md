# Red Hat Summit Lightning Talk - Vert.x Auto Reload

One aspect of Vert.x is it's ability to make a developer's
life easier with a feature known as auto-reload. Similar
to tools like Gulp or Grunt, Vert.x applications (even
using compiled languages) support automatic re-compile
and reload every time a source file is changed. This makes
it quick and easy to rapid application development and
testing.

## Pre-requisites
* Java >= 8 (OpenJDK or Oracle)
* Apache Maven >= 3.3.9
* Internet Access

## Run in auto-reload mode
```
mvn clean compile vertx:run
```

While the application is running like this, if you change any of the files
contained in the `src` directory, the Vert.x Maven Plugin will
re-compile Java source files and reload the application! Sweet!
