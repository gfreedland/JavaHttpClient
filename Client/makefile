JFLAGS = -g
JC = javac
JVM = java
MAIN = Client
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
				Client.java 

default: classes

classes: $(CLASSES:.java=.class)

run: classes
	  $(JVM) $(MAIN)

clean:
		$(RM) *.class
