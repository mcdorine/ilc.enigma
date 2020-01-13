# TP 4A SQR 2019-20: enigma
Code for the German Enigma machine used in WW2.

## Questions
x Fork this github repository
x Run the project
x Comment the 3 classes
x Commit your changes and check-it into github
x Complete the next section : "Functions to be tested" into this file
x Commit your changes (commit README.md)
~ Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
x Commit your changes
x On github, make a pull request 
x that ends

## Functions to be tested
Hereafter, for each classes give function to be tested. Remember that all functions does not have to be tested, some code can be checked by a simple inspection or an analyse, another code can be validated by definition (rules, etc) the others function can be tecsted by unit tests, integration tests or validation tests (IADT: Inspect, Analyse, Define, Test). 

### Classe Machine
#### functions
- advanceRotors

### Classe Reflector
#### functions

### Classe Rotor
#### functions
- convertForward
- convertBackward

## Tricks & tips

- Start with simple classes (models, libraries, etc) at the end make test into complex classes (classes with multiple relations)
- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Rotor, then test the rotor instance's state
> Rotor r=new Rotor();
> int actual = r.getosition();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

## Documentation and validation set
### How simulate Enigma machine:
- https://korben.info/enigma-le-simulateur.html
### Configuration code :
- * B III IV I AXLE
- FROM his shoulder Hiawatha / HYIHL BKOML IUYDC MPPSF SZW
- Took the camera of rosewood / SQCNJ EXNUO JYRZE KTCNB DGU



 
