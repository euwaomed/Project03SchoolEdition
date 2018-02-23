## Project 03

## Instructions

After cloning your repository into Intellij run the following commands to access the unit tests.

``` sh
git submodule init
git submodue update --remote
```

The objective of this project is to create a simple interactive calculator.
Inside of ```src/Calculator.java``` you must fill in the main method.
You may create additional methods as needed.

After running the program the user should be able to enter simple commands as shown below.
Each command is evaluated and the output is written to the console.
This continues until the user enters an exit command.

## Example Input
```
add 1 2
mul 4 3
sub 6 2
div 10 3
exit
```

## Example Output
```
3
12
4
3
```

## Grading

Use the test runner located as ```tests/TestRunner.java``` to estimated your grade.
You can also run the calculator unit tests directly for more detailed messages.
