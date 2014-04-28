#compiles programs in the correct order to avoid any problems
import os
os.system("javac PerTable.java")
os.system("javac Element.java")
os.system("javac SplashScreen.java")
os.system("javac PrevEq.java")
os.system("javac Tester.java")
os.system("java Tester")
