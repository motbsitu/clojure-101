# Clojure Exercises - Lynda Learning Clojure

## Terms
* Simple - primary goal of Clojure
* Value - anything that does not change over time
* Compound - data that is made of other data
* Identity - a sequence of values that change with time and have a name
* Evaluate - translate one expression to the next
* Function
* REPL - interactive program that lets you type code and see results

## Leiningen Build Tool
loaded on my system
* to run - lein repl
* to exit ctrl d

* REPL - Read (look at code) Evaluate (run) Print Loop
* Clojure is Compiled Lanugage
 - compiler runs when you hit enter
 - Unit of completion is the form
 - One pass - functions must be defined before called


## Structure
* Code is lists of (verb object object ...) Action, then argument
* Called s-expressions or expressions
* (function-name arg1 arg2)
* math - operator comes before numbers it works on

## Numbers
* longs  0 -1 428
* doubles  .00001
* ratios    3/2  22/7
* BigInts  9999999999999N
* BigDecimals   .00000000001M
Numerics are safe by default

## Letters
* Characters \a \space
* Strings "string"
* Regular expression  # "cat"

## Symbols
* Current namespace.
* Valid names: not start with a number, all the letters and numbers, as well as * + ! - _ ' ?

## Components of Clojure Language
### if
(if condition
    value-if-true
    value-if-false)

### do
If this is true, do four things...
(do
    value-to-ignore
    value-to-ignore
    value-to-return)

### def
Define vars in namespace
  (def symbol value)

### Looping
(loop [name initial-value]
    code
    (recur new-value-for-name))

### Exceptions
(try
    normal-return-value
    (catch Exception name
      return-value-if-thrown)
    (finally
      code-to-always-run)

### Java Method Invocation
(. Object methodName)

### read, eval
