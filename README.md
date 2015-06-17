# curses-java-api
Java bundle for jcurses, a java api wrapper for the ncurses package (requires the native layer)

Overview
-------------------------

The Java Curses Library (JCurses) is a library for developing text terminal based applications using Java programming language.
It is implemented as a Windowing toolkit similar to AWT, but built upon the UNIX "curses" windowing system.

The original package was found on SourceForge (http://sourceforge.net/projects/javacurses/) but it appears like the project has
been abandoned.  It has been repackaged, to build with gradle, but has almost no code changes.

Gradle Build
-------------------------

This package includes all the necessary and standard gradle files.  The gradle wrapper is the preferred way to invoke gradle commands.

./gradlew build

will produce several jar files in the projects *~/build/libs* directory.  Typically, one of these jars should be used as *jcurses.jar*
