package scalaforimpatient.traits.selftype

import scalaforimpatient.traits.Logger

trait LoggedException extends Logger {
  this:Exception =>
  def log():Unit = {log(getMessage)}
}

/*
Note: When a trait extends a class, there is a guarantee that the superclass is present in any class mixing in the trait.
 Scala has an alternate mechanism for guaranteeing this: self types.

Note that the trait does not extend the Exception class. Instead, it has a self type of Exception.
 That means, it can only be mixed into subclasses of Exception.
In the trait’s methods, we can call any methods of the self type.
For example, the call to getMessage() in the log method is valid, since we know that this must be an Exception.
If you try to mix the trait into a class that doesn’t conform to the self type, an error occurs.

There are a few situations where the self type notation is more flexible than traits with supertypes.
Self types can handle circular dependencies between traits. This can happen if you have two traits that need each other.
Self types can also handle structural types—types that merely specify the methods that a class must have, without naming the class.
Here is the LoggedException using a structural type:

trait LoggedException extends Logged {
  this: { def getMessage() : String } =>
    def log() { log(getMessage()) }
}
The trait can be mixed into any class that has a getMessage method.
 */